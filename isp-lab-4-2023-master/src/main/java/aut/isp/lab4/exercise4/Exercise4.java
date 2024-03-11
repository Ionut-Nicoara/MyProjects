package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {

        FishFeederV3 fedeer = new FishFeederV3("Fisherman","R10",10);
        LightsControl lightsControl = new LightsControl(6.0f,8.0f);
        AquariumControllerV3 A1 = new AquariumControllerV3(fedeer,"Aquafor","V12",9.0f,15.0f,6.0f,8.0f);

        lightsControl.turnOn();
        lightsControl.turnOn();





    }
}
