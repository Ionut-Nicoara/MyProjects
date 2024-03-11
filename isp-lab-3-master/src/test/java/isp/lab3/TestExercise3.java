package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExercise3 {

    @Test

    public void TestToStringMethod(){
        Vehicle V1 = new Vehicle("Audi","R8",350,'B');
        assertEquals("Audi(R8) speed 350 fuel type B",V1.toString());
    }

    @Test

    public void TestNumberOfObjects(){
        Vehicle V1 = new Vehicle("Audi","R8",350,'B');
        Vehicle V2 = new Vehicle("BMW", "Seria5",220,'D');
        assertEquals(2,Vehicle.NumberOfObjects());
    }
}
