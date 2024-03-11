package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.Fish_Feeder;

public class AquariumControllerV3 {

    private FishFeederV3 feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private LightsControl lightsControl;

    public AquariumControllerV3(FishFeederV3 feeder, String manufacturer, String model, float currentTime, float feedingTime, float lightsOnTime, float lightsOffTime){

        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.lightsControl = new LightsControl(lightsOnTime, lightsOffTime);
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
        lightsControl.setCurrentTime(currentTime);
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
