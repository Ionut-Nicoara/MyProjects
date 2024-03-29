package aut.isp.lab4.exercise5;

public class Sensor {

    private String manufacturer;
    private String model;

    public Sensor(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
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

    @Override

    public String toString(){
        return "Sensor: " + manufacturer + " " + model;
    }
}
