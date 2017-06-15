package RMI;

import java.rmi.Naming;

/**
 * Created by suraz on 4/28/17.
 */
public class TestRMIClient {
    public static void main(String[] args) {
        try {
            String strURL ="rmi://127.0.0.1/test";
            TestInterface TestInf = (TestInterface) Naming.lookup(strURL);
            System.out.println("The sum is: "+ TestInf.add(550,450));
            System.out.println("The difference is :"+ TestInf.sub(550,450));

        }
        catch (Exception e){

            System.out.println("Error in Client :"+ e);
        }
    }
}
