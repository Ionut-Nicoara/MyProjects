package aut.isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerV3Test {

    @Test

    public void setLightsOnTimeTest(){
        LightsControl L1 = new LightsControl(10.0f,16.0f);
        L1.setLightsOnTime(14.0f);
        assertEquals(14.0f,L1.getLightsOnTime(),0.01f);
    }

    @Test

    public void setLightsOffTimeTest(){
        LightsControl L1 = new LightsControl(10.0f,16.0f);
        L1.setLightsOffTime(18.0f);
        assertEquals(18.0f,L1.getLightsOffTime(),0.01f);
    }
}
