package aut.isp.lab4.exercise5;

public class Actuator {

    private String manufacturer;
    private String model;
    private boolean status = false;

    public Actuator(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;

    }

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;
    }

    @Override

    public String toString(){
        return "Actuator: " + manufacturer + " " + model;
    }


}
