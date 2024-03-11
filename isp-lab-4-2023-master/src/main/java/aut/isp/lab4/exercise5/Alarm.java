package aut.isp.lab4.exercise5;

public class Alarm extends Actuator {

    public Alarm(String manufactuer, String model, boolean status){
        super(manufactuer, model);
    }

    private boolean AlarmStatus = false;

    public void turnOn(){
        AlarmStatus = true;
        System.out.println("The alarm is ON");
    }

    public void turnOff(){
        AlarmStatus = false;
        System.out.println("The alarm is OFF");
    }

}
