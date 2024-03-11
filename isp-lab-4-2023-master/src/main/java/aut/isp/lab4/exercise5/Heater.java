package aut.isp.lab4.exercise5;

    public class Heater extends Actuator{

        public Heater(String manufactuer, String model){
            super(manufactuer, model);
        }
        private boolean HeaterStatus = false;

        public void turnOn(){
            HeaterStatus = true;
            System.out.println("The heater is ON");
        }

        public void turnOff(){
            HeaterStatus = false;
            System.out.println("The heater is OFF");
        }
    }

