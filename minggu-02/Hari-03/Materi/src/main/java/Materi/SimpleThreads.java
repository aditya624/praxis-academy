package Materi;
public class SimpleThreads{
    static void threadMessage(String message){
        String threadName=Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
    private static class MessageLoop extends Thread{
        
        public void run() {
            String info[]={"pi","ka","cu","pa"};
            try {
                for (int i = 0; i < info.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(info[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        long patience = 1000 * 60 * 60;
        if (args.length>0) {
            try {
                patience=Long.parseLong(args[0])*1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
                //TODO: handle exception
            }            
        }
        threadMessage("Starting message loop");
        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        MessageLoop t = new MessageLoop();
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop
        // thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join();
            // if (((System.currentTimeMillis() - startTime) > patience)
            //       && t.isAlive()) {
            //     threadMessage("Tired of waiting!");
            //     t.interrupt();
            //     // Shouldn't be long now
            //     // -- wait indefinitely
            //     t.join();
            // }
        }
        threadMessage("Finally!");
    }
}