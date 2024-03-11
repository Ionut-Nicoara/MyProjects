package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        Vehicle V1 = new Vehicle("Audi", "A4", 250,'B');
        Vehicle V2 = new Vehicle("BMW", "Seria5",220,'D');
        System.out.println(V1.toString());
        System.out.println(V2.toString());

        //Test getter and setter methods

        System.out.println(V1.getModel());
        V2.setSpeed(300);
        System.out.println(V2.getSpeed());

        //Return the number of objectes created
        System.out.println(Vehicle.NumberOfObjects());

        //Compare if two objects are equals

        System.out.println(V1.equals(V2));
        System.out.println(V1.equals(new Vehicle("Audi","A4",250,'B')));


    }


}
