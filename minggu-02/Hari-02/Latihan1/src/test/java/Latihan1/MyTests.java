package Latihan1;
import org.junit.Test;
import static junit.framework.Assert.*;


public class MyTests{
    @SuppressWarnings("deprecation")
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested
        double b = tester.multiply(10, 0);
        double c = tester.multiply(0, 10);
        double d = tester.multiply(0, 0);
        // assert statements
        assertEquals(0.0, b);
        assertEquals(0.0, c);
        assertEquals(0.0, d);
    }
}