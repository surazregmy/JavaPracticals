package FH;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by suraz on 4/6/17.
 */

public class Copyfile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int c;
        try {
            fis = new FileInputStream("/media/suraz/New Volume/Ubuntu/JavaProjects/src/FH/input.txt");
            fos = new FileOutputStream("/media/suraz/New Volume/Ubuntu/JavaProjects/src/FH/output.txt");

            while ((c=fis.read()) != -1){
                fos.write(c);
                System.out.println((char) c);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        fis.close();
        fos.close();
    }

}
