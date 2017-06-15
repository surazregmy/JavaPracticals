package FH;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by suraz on 4/6/17.
 */
public class ReadNums {
    public static void main(String[] args) throws Exception {
        DataInputStream dataInputStream=new DataInputStream(System.in);
        PrintStream printStream=new
                PrintStream(new FileOutputStream("/media/suraz/New Volume/Ubuntu/JavaProjects/src/FH/sum.txt"));
        System.out.println("Enter two numbers: ");
        int x=Integer.parseInt(dataInputStream.readLine());
        int y=Integer.parseInt(dataInputStream.readLine());
        int sum=x+y;
        printStream.println("The sum is "+sum);
        System.out.println("The sum is"+sum);

        dataInputStream.close();;
        printStream.close();
    }
}
