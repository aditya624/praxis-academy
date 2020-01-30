package Materi;

public class HelloThread extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Menggunakan Thread");
    }
    public static void main(String[] args) {
        HelloThread Th=new HelloThread();
        Th.start();
    }
}