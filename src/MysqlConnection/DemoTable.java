package MysqlConnection;

import javax.swing.*;
import java.sql.*;

/**
 * Created by suraz on 3/31/17.
 */
public class DemoTable extends JFrame{
    Connection conn;
    Statement st;
    ResultSet rst;
    JTable table;

    Object [][] cells;
    int rows;
    DemoTable() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/class_adbms","root","");
            st = conn.createStatement();
            rst = st.executeQuery("Select * from person");
            rst.last();
            rows = rst.getRow();
            rst.first();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        cells = new Object[rows][2];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < 2; j++) {
                    cells[i][j] = rst.getString(j + 1);
                }


                rst.next();
            }

        }
        catch (Exception e){
            System.out.println(" The error2 "+ e);
        }

        setTitle("Table");
        setSize(400,200);

        table = new JTable(cells,columnNames);
        getContentPane().add(new
                JScrollPane(table) );

    }
    String [] columnNames = {
        "ID","Name"
    };

    public static void main(String[] args) throws SQLException {
        DemoTable dt = new DemoTable();
        dt.show();
    }
}
