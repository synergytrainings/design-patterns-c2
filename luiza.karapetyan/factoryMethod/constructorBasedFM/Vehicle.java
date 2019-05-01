package factoryMethod.constructorBasedFM;

/**
 * Created by Luiza.Karapetyan on 5/1/2019.
 */
public class Vehicle {
    public void info() {
        System.out.println("This is base class");
    }

    public static Vehicle createVehicle(VehicleType type) {
        Vehicle vehicle = null;
        switch (type) {
            case BOAT:
                vehicle = new Boat();
                break;
            case CAR:
                vehicle = new Car();
                break;

            case PLANE:
                vehicle = new Plane();
                break;
            default:
                throw new IllegalArgumentException("Wrong vehicle type:" + type);
        }


        return vehicle;
    }
}
