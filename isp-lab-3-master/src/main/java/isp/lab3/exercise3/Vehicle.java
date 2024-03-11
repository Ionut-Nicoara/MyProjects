package isp.lab3.exercise3;

public class Vehicle {

    private String model;
    private String type;
    private int speed;
    private char fuelType;

    private static int nrObjCreated = 0;

    public Vehicle(String model, String type, int speed, char fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        nrObjCreated++;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public char getFuelType(){
        return this.fuelType;
    }

    public void setFuelType(char fuelType){
        this.fuelType = fuelType;
    }

    public String toString(){
      return model + "(" + type + ")" + " speed " + speed + " fuel type " + fuelType;

    }

    public boolean equals(Object o) {
        if (o instanceof Vehicle) {
            Vehicle other = (Vehicle) o;
            return this.model.equals(other.model) && this.type.equals(other.type) &&
                    this.speed == other.speed && this.fuelType == other.fuelType;
        }
        return false;
    }

    public static int NumberOfObjects(){
        return nrObjCreated;
    }

}
