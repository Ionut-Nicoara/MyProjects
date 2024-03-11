package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        Fish_Feeder feeder = new Fish_Feeder("FishMax","V10",14);
        Aquarium_Controller F1 = new Aquarium_Controller(feeder, "AquaVita","X100",12.0f,12.30f);

        F1.setCurrentTime(12.30f);
        F1.setFeedingTime(15.30f);
        F1.setCurrentTime(15.30f);
        System.out.println(F1.toString());


    }
}
