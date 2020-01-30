package Materi;
public class SleepMessage{
    public static void main(String[] args) throws InterruptedException {
        String info[]={"pi","ka","cu"};
        for (int i = 0; i < info.length; i++) {
            try {
                Thread.sleep(4000);    
            } catch (InterruptedException e) {
                return;
            }
            
            System.out.println(info[i]);
        }
    }
}