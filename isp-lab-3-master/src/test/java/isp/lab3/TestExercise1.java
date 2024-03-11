package isp.lab3;
import isp.lab3.exercise1.Tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise1 {

    @Test

    public void TestGrowMethod(){
        Tree t1 = new Tree();
        t1.Grow(10);
        assertEquals("Height is: 25",t1.toString());
    }

    @Test

    public void TestGrowMethodWithZero(){
        Tree t1 = new Tree();
        t1.Grow(0);
        assertEquals("Height is: 15", t1.toString());
    }

    @Test

    public void TestToStringMethod(){
        Tree t1 = new Tree();
        assertEquals("Height is: 15", t1.toString());
    }
}
