package Assignment1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by suraz on 4/7/17.
 */
public class Copyfile {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        int c;
        try {
            fr = new FileReader("/media/suraz/New Volume/Ubuntu/JavaProjects/src/Assignment1/input.txt");
            fw = new FileWriter("/media/suraz/New Volume/Ubuntu/JavaProjects/src/Assignment1/output.txt");

            while ((c = fr.read()) != -1) {
                fw.write(c);
                if ((char) c == ' ') {
                    fw.write(c);
                } else if ((char) c == '\n') {
                    fw.write('\n');
                }

            }
        } catch (Exception e) {
            e.printStackTrace();


        }
        fr.close();
        fw.close();
    }
}
