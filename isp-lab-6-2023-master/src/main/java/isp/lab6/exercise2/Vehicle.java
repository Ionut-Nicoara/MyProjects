package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.Set;
public class Vehicle {
    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String vin, String licensePlate, String make, String model, int year) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vin.equals(vehicle.vin);
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }
}
