package TrainGradle;

public class Bicycle{
    public int cadence;
    public int gear;
    public double speed;

    public Bicycle(int cadence,int gear,double speed){
        this.cadence=cadence;
        this.gear=gear;
        this.speed=speed;
    }

    public int getCadence(){
        return cadence;
    }
    public int getGear(){
        return gear;
    }
    public double getSpeed(){
        return speed;
    }

    public void setCadence(int cadenceBaru){
        cadence=cadenceBaru;
    }
    public void setGear(int gearBaru){
        gear=gearBaru;
    }
    public void setSpeed(Double speedBaru){
        speed=speedBaru;
    }
    public void applyBrake(Double decrement) {
        speed -= decrement;
    }
        
    public void speedUp(Double increment) {
        speed += increment;
    }    
}
