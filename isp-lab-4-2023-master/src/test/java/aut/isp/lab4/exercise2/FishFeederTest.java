package aut.isp.lab4.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishFeederTest {

    @Test

    public void feedTest(){

        FishFeeder F1 = new FishFeeder("FishMax","V7");
        F1.feed();
        F1.feed();
        assertEquals(12, F1.getMeals());

    }

    @Test

    public void toStringTest(){

        FishFeeder F1 = new FishFeeder("FishMax","V7");
        assertEquals("Fish feeder FishMax V7", F1.toString());
    }

    @Test

    public void fillUpTest(){

        FishFeeder F1 = new FishFeeder("FishMax","V7");
        F1.feed();
        F1.feed();
        F1.feed();
        F1.fillUp();
        assertEquals(14,F1.getMeals());
    }


}
