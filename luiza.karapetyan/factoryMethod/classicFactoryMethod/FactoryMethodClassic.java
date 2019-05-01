package factoryMethod.classicFactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luiza.Karapetyan on 5/1/2019.
 */
public class FactoryMethodClassic {
    public static void main(String[] args) {
        BoatFactory bf = new BoatFactory();
        CarFactory cf = new CarFactory();
        PlaneFactory pf = new PlaneFactory();
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bf.createVehicle());
        vehicles.add(cf.createVehicle());
        vehicles.add(pf.createVehicle());
        for (Vehicle v : vehicles) {
            v.info();
        }
    }
}
