package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {

        FishFeeder F1 = new FishFeeder("Booster","XC100");
        System.out.println(F1.toString());
        F1.mealStatus();
        F1.feed();
        F1.feed();
        F1.feed();
        F1.mealStatus();
        F1.fillUp();
        F1.mealStatus();
    }
}
