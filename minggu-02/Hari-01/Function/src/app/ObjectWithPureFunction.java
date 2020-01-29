package app;
public class ObjectWithPureFunction{

    public int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        ObjectWithPureFunction obj=new ObjectWithPureFunction();
        int a=5;
        int b=6;
        int c=0;
        System.out.println(obj.sum(a,b));
    }
}