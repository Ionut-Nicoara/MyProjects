package aut.isp.lab4.exercise4;

public class LightsControl {

    private float lightsOnTime;
    private float lightsOffTime;
    private boolean lightsOn;

    public LightsControl(float lightsOnTime, float lightsOffTime){
        this.lightsOnTime = lightsOnTime;
        this.lightsOffTime = lightsOffTime;
        this.lightsOn = false;
    }

    public float getLightsOnTime() {
        return lightsOnTime;
    }

    public float getLightsOffTime() {
        return lightsOffTime;
    }

    public void setLightsOnTime(float lightsOnTime) {
        this.lightsOnTime = lightsOnTime;
    }

    public void setLightsOffTime(float lightsOffTime) {
        this.lightsOffTime = lightsOffTime;
    }

    public void setCurrentTime(float currentTime){
        if(currentTime >= lightsOnTime && currentTime < lightsOffTime){
            turnOn();
        }
        else{
            turnOff();
        }
    }

    public void turnOn(){
        lightsOn = true;
        System.out.println("Aquarium lights are turned ON");
    }

    public void turnOff(){
        lightsOn = false;
        System.out.println("Aquarium lights are turned OFF");
    }
}
