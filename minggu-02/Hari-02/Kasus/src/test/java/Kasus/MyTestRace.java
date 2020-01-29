package Kasus;
import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTestRace{
    private Bicycle bic;
    @Before
    public void setUp(){
        bic= new Bicycle(5, 4, 3.0);
    }
    @Test
    public void mustGetCadenceFive(){
        int a=5;
        int b=bic.getCadence();
        assertEquals(a, b);
    }
}