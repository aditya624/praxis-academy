package Latihan1;

public class MyClass{
    public double multiply(double a,double b){
        return a*b;
    }
    public double add(double c,double d){
        return c+d;
    }
    
    public static void main(String[] args) {
        double a=10;
        double b=5;
        MyClass obj=new MyClass();
        System.out.println("Hasil kali : "+obj.multiply(a, b));
        System.out.println("Hasil tambah "+obj.add(a, b));
    }
}