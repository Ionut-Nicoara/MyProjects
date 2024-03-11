package isp.lab3;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise5 {

    @Test

    public void TestDisplayProducts(){

        VendingMachine V1 = new VendingMachine();
        V1.DisplayProducts();
    }

    @Test

    public void TestInsertCoin(){
        VendingMachine V1 = new VendingMachine();
        V1.InsertCoin(5);
        V1.InsertCoin(10);
        V1.DisplayCredit();
    }

    @Test

    public void TestSelectProduct(){
        VendingMachine V1 = new VendingMachine();
        V1.InsertCoin(10);
        String productname = V1.SelectProduct(2);

    }
}
