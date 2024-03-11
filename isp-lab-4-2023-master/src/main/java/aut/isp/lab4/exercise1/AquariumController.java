package aut.isp.lab4.exercise1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class AquariumController {

    private String manufacturer;

    private String model;

    private float currentTime;


    public AquariumController(String manufacturer, String model, float currentTime){

        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCurrentTime(){
        return currentTime;
    }

    public void setCurrentTime(float currentTime){
        this.currentTime = currentTime;
    }


    @Override

    public String toString(){
        return "AquariumController " + getManufacturer() + " " + getModel() + " {Time: " + getCurrentTime() + "}";
    }
}
