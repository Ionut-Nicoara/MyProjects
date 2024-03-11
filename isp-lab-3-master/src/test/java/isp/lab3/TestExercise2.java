package isp.lab3;

import isp.lab3.exercise2.Rectangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExercise2 {

    @Test

    public void TestGetLength(){
        Rectangle R1 = new Rectangle(1,2);
        assertEquals(1,R1.getLength());
    }

    @Test

    public void TestGetWidth() {
        Rectangle R1 = new Rectangle(1, 2);
        assertEquals(2, R1.getWidth());
    }

    @Test

    public void TestGetColor() {
        Rectangle R1 = new Rectangle(1, 2,"blue");
        assertEquals("blue", R1.getColor());
    }

    @Test

    public void TestGetPerimeter() {
        Rectangle R1 = new Rectangle(2, 4,"blue");
        assertEquals(12,R1.getPerimeter(),0.1);
    }

    @Test

    public void TestGetArea() {
        Rectangle R1 = new Rectangle(2, 4,"blue");
        assertEquals(8,R1.getArea(),0.1);
    }


}
