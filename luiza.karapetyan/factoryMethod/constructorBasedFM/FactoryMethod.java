package factoryMethod.constructorBasedFM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luiza.Karapetyan on 5/1/2019.
 */
public class FactoryMethod {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(Vehicle.createVehicle(VehicleType.CAR));
        vehicles.add(Vehicle.createVehicle(VehicleType.BOAT));
        vehicles.add(Vehicle.createVehicle(VehicleType.PLANE));
        for(Vehicle vehicle: vehicles){
            vehicle.info();
        }
        }
    }
