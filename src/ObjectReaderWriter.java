import FH.Employee;

import java.io.*;

/**
 * Created by suraz on 4/6/17.
 */
public class ObjectReaderWriter {
    public static void main(String[] args) throws  Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/media/suraz/New Volume/Ubuntu/JavaProjects/src/FH/info.dat"));
        Employee emp = new Employee(101,"Suraj Regmi",150000);
        oos.writeObject(emp);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/media/suraz/New Volume/Ubuntu/JavaProjects/src/FH/info.dat"));
        emp =(Employee)ois.readObject();
        System.out.println("Employee Record");
        System.out.println("Id "+ emp.getId());
        System.out.println("Name "+ emp.getName());
        System.out.println("Salary "+ emp.getSalary());

    }
}
