package Singleton;
public class SingleObject{
    private static SingleObject instance = new SingleObject();
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
     }
}