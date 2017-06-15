package FH;

import java.io.Serializable;

/**
 * Created by suraz on 4/6/17.
 *
 */
// Reading and writing objects and object serialzation
public class Employee implements Serializable {
    private  int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){return  id;}
    public  String getName(){return name;}
    public int getSalary(){return salary;}
}
