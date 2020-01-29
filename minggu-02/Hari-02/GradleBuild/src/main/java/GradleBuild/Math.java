package GradleBuild;

public class Math{
    public static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");
    
        return dividend / divisor;
    }
    public static int add(int c,int d){
        return c+d;
    }
    public static void main(String[] args) {
        int a=10,b=2;
        System.out.println("Hasil = "+divide(a,b));
    }
}