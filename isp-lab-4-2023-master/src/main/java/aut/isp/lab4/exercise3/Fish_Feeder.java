package aut.isp.lab4.exercise3;

public class Fish_Feeder {

    private String manufacturer;
    private String model;
    private int meals;

    public Fish_Feeder(String manufacturer, String model, int meals){

        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
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

    public int getMeals() {
        return meals;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public void fillUp(){
        meals = 14;
        System.out.println("The fish feeder has 14 meals left");
    }

    public void mealStatus(){
        System.out.println("The fish feeder has " + meals + " meals left");
    }

    public void feed(){
        if(meals>0){
            meals--;
            System.out.println("The fish feeder has " + meals + " meals left");
        } else {
            fillUp();
        }
    }

    @Override

    public String toString(){
        return "Fish feeder " + manufacturer + " " + model;

    }


}