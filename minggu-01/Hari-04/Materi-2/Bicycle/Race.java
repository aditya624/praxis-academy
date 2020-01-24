import Bicycle.Bicycle;

public class Race extends Bicycle{
    public static void main(String[] args) {
        Bicycle obj= new Bicycle(10, 20, 100.0);
        while (obj.getSpeed()<=200.0 && obj.getSpeed()>=0.0) 
        {
            obj.applyBrake(20.0);
            obj.speedUp(10.0);
            System.out.println("Speed : "+obj.getSpeed());
            
        }
        int x=5;
        passMethod(x);
        System.out.println("Tampil x = "+x);
    }

    public static void passMethod(int a){
        a=a+50;
    }
}