package isp.lab3;

import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise4 {

    @Test

    public void TestToStringMethod(){
        MyPoint M1 = new MyPoint(3,2,1);
        assertEquals("(3, 2, 1)",M1.toString());
    }

    @Test

    public void TestDistanceMethod(){
        MyPoint M1 = new MyPoint(4,3,2);
        MyPoint M2 = new MyPoint(3,2,1);
        assertEquals(1.7320508,M1.Distance(M2),0.1);
    }
}
