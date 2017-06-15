//package MysqlConnection;
//
///**
// * Created by suraz on 3/30/17.
// */
//
//import  java.sql.*;
//
//public class MainConnector {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        System.out.println("Driver loaded");
//
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/class_adbms","root","");
//        System.out.println("Database connected");
//
//        Statement statement = connection.createStatement();
//        String sql = "Insert into person value(8,'ramesh')";
//        statement.executeUpdate(sql);
//
//
//        ResultSet resultSet = statement.executeQuery("Select * from person");
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1)+ " \t"+ resultSet.getString(2));
//        }
//        connection.close();
//
//
//
//    }
//}
