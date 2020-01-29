package Latihan1;
import org.junit.Test;
import static junit.framework.Assert.*;
public class MySecondTest{
    @SuppressWarnings("deprecation")
    @Test
    public void addShouldReturnTen(){
        MyClass obj=new MyClass();//Class Tested
        double a=10;
        double b=obj.add(5, 5);
        double c=obj.add(6,4);
        double d=obj.add(9,1);
        assertEquals(a, b);
        assertEquals(a, c);
        assertEquals(a, d);       
        
    }
}