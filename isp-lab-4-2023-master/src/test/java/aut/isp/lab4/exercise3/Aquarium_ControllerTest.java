package aut.isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Aquarium_ControllerTest {

    @Test

    public void setCurrentTimeTest(){
        Fish_Feeder feeder = new Fish_Feeder("FishMax","V10",14);
        Aquarium_Controller F1 = new Aquarium_Controller(feeder, "AquaVita","X100",12.0f,12.30f);
        F1.setCurrentTime(18.30f);
        assertEquals(18.30f,F1.getCurrentTime(),0.01);
    }

    @Test

    public void setFeedingTimeTest(){
        Fish_Feeder feeder = new Fish_Feeder("FishMax","V10",14);
        Aquarium_Controller F1 = new Aquarium_Controller(feeder, "AquaVita","X100",12.0f,12.30f);
        F1.setFeedingTime(15.30f);
        assertEquals(15.30f,F1.getFeedingTime(),0.01);
    }


}
