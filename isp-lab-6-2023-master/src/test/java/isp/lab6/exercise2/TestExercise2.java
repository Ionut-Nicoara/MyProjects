package isp.lab6.exercise2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
public class TestExercise2 {

    private VehicleRegistrySystem registry;

    @Before
    public void setUp() {

        registry = new VehicleRegistrySystem();
    }

    @Test
    public void testAddVehicle() {
        Vehicle vehicle1 = new Vehicle("VIN123", "ABC123", "Toyota", "Corolla", 2018);
        registry.addVehicle(vehicle1);
        assertEquals(true, registry.hasVehicle("VIN123"));
        Vehicle vehicle2 = new Vehicle("VIN456", "DEF456", "Honda", "Civic", 2019);
        registry.addVehicle(vehicle2);
        assertEquals(true, registry.hasVehicle("VIN456"));
    }

    @Test
    public void testRemoveVehicle() {
        Vehicle vehicle1 = new Vehicle("VIN123", "ABC123", "Toyota", "Corolla", 2018);
        registry.addVehicle(vehicle1);
        assertEquals(true, registry.hasVehicle("VIN123"));
        registry.removeVehicle("VIN123");
        assertEquals(false, registry.hasVehicle("VIN123"));
    }
}

