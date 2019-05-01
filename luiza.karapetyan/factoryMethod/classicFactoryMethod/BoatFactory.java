package factoryMethod.classicFactoryMethod;

/**
 * Created by Luiza.Karapetyan on 5/1/2019.
 */
public class BoatFactory implements VehicleFactory{

    public Vehicle createVehicle() {
        return new Boat();
    }
}
