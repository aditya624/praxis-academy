package GradleBuild;

import org.junit.Test;
import static junit.framework.Assert.*;

public final class MathTest {
    @SuppressWarnings("deprecation")
    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = Math.divide(10, 5);
        assertEquals("Sesuai", expected, actual);
        
    }
    @SuppressWarnings("deprecation")
    @Test
    public void TestAdd(){
        final double harapan=9;
        final double sebenarnya=Math.add(3, 6);
        assertEquals(harapan, sebenarnya);
    }
}
