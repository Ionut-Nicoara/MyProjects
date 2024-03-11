package aut.isp.lab4.exercise5;

public class Aquarium {
    private Feeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;

    public Aquarium(Feeder feeder, String manufacturer, String model, float currentTime, float feedingTime,int temperature){

        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.temperature = temperature;
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

    public void checkTemperature(){
        if(temperature >= 24 && temperature <= 27){
            System.out.println("The temperature is perfect :)");
        }
        else if(temperature < 24){

        }
    }

    @Override

    public String toString(){

        return "\n" + "Feeder: " + feeder + "\n" + "AquariumController: "
                + manufacturer + " " + model + " " + "->Current time: " + currentTime + " "
                + "->Feeding time: " + feedingTime;
    }

}
