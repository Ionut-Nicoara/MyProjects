package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.Set;
public class VehicleRegistrySystem {
    private static Set<Vehicle> vehicles = new HashSet<>();

    public static void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("Vehicle added to registry: " + vehicle.getMake() + " " + vehicle.getModel());
        } else {
            System.out.println("Vehicle with VIN " + vehicle.getVin() + " already exists in registry.");
        }
    }

    public static void removeVehicle(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                vehicles.remove(vehicle);
                System.out.println("Vehicle with VIN " + vin + " removed from registry.");
                return;
            }
        }
        System.out.println("Vehicle with VIN " + vin + " not found in registry.");
    }

    public static boolean hasVehicle(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                return true;
            }
        }
        return false;
    }

    public static void displayVehicles() {
        System.out.println("List of vehicles in registry:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
