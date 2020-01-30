package Materi;
public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Th dari Runnable");
    }
    public static void main(String[] args) {
        HelloRunnable Th= new HelloRunnable();
        Thread Thnew=new Thread(Th);
        Thnew.start();
    }
}