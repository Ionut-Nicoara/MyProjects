package aut.isp.lab4.exercise3;

public class Aquarium_Controller {

    private Fish_Feeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;

    public Aquarium_Controller(Fish_Feeder feeder, String manufacturer, String model, float currentTime, float feedingTime){

        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public float getFeedingTime(){
        return feedingTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (currentTime == feedingTime) {
            feeder.feed();
        }
    }

    public void setFeedingTime(float feedingTime){
            this.feedingTime = feedingTime;
        }

        @Override

    public String toString(){

        return "\n" + "Feeder: " + feeder + "\n" + "AquariumController: "
        + manufacturer + " " + model + " " + "->Current time: " + currentTime + " "
        + "->Feeding time: " + feedingTime;
        }

    }






