package app;
public class GenericMethodTest{
    public static <T> void printArry(T[] input){
        for(T element:input){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

        printArry(intArray);
        printArry(doubleArray);
    }
}