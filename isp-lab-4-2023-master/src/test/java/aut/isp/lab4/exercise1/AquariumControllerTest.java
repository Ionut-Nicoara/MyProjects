package aut.isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {

    @Test

    public void ToStringTest(){
        AquariumController A1 = new AquariumController("AquaVita","A500",18.12f);
        assertEquals("AquariumController AquaVita A500 {Time: 18.12}", A1.toString());
    }

    @Test

    public void SetTimeTest(){
        AquariumController A1 = new AquariumController("AquaVita","A500",18.12f);
        A1.setCurrentTime(10.01f);
        assertEquals(10.01f,A1.getCurrentTime(),0.1);
    }
}
