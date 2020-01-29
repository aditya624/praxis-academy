package app;
public class ObjectWithNonPureFunction{
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
    public static void main(String[] args) {
        ObjectWithNonPureFunction obj= new ObjectWithNonPureFunction();
        System.out.println(obj.add(10));
    }
}