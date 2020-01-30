package Kasus;
public class NotSynchronizedCounter implements Runnable {
    private static int counter = 0;
 
    public void run() {
        while(counter < 10) {
            System.out.println("["+Thread.currentThread().getName()+"] before: "+counter);
            counter++;
            System.out.println("["+Thread.currentThread().getName()+"] after: "+counter);
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new NotSynchronizedCounter(), "thread-"+i);
            threads[i].start();
        }
        for(int i=0; i<threads.length; i++) {
            threads[i].join();
        }
    }
}