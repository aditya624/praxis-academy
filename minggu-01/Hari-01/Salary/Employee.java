import java.io.*;

public class Employee{
    //untuk varibel nama
    public String name;
    //variabel slary hanya ada di 
    private double salary;
    public Employee(String empname)
    {
        name=empname;
    }
    public void setSalary(double empsal){
        salary=empsal;
    }
    public void printemp(){
        System.out.println("nama : "+name);
        System.out.println("salary : "+salary);
    }
    public static void main(String[] args) {
        Employee gaji= new Employee("Pika");
        gaji.setSalary(2020);
        gaji.printemp();
    }
}