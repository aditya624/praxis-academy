# Concurent 
Aktifikas yang dilakukan bersamaan.
# Threads 
Threadss hampir mirip dengan method yang dapat dipanggil berkali kali. pemanggilan package dari 
```
import java.lang.Thread
```

contoh code 
```
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}
```
atau 
```
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
```
dengan mengextends Thread kemudian menambahkan method run().

## Thread.Sleep ()
digunakan untuk memberi delay pada Thread. berikut dimaksudkan delay selama 4 detik.
```
Thread.Sleep(4000) 
```
Berikut beberapa perintah misalkan didefinisikan ```th``` adalah objek dari Thread

```th.start``` digunakan untuk memulai th.

```th.join``` untuk delay menunggu sampai Thread th selesai di eksekusi

