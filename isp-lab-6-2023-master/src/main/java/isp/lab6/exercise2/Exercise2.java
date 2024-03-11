package isp.lab6.exercise2;

import static isp.lab6.exercise2.VehicleRegistrySystem.*;

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("1HGCM82633A004352", "SV58LJM", "Seat", "Ibiza", 2003);
        Vehicle vehicle2 = new Vehicle("2G1WT55KX59381955", "CJ43ETI", "Audi", "A7", 2005);
        Vehicle vehicle3 = new Vehicle("3VWCM81H9YM158620", "BN36BOG", "Volkswagen", "Passat", 2000);

        addVehicle(vehicle1);
        addVehicle(vehicle2);
        addVehicle(vehicle3);

        removeVehicle("MM87XZV"); // Not in registry
        removeVehicle("SV58LJM");

        System.out.println("Registry contains vehicle with VIN 1HGCM82633A004352: " + hasVehicle("1HGCM82633A004352"));
        System.out.println("Registry contains vehicle with VIN XYZ123: " + hasVehicle("XYZ123"));
    }

}
