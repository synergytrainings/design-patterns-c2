import api.SpeedCamera;
import api.Vehicle;
import impl.*;

/**
 * Author: David.Shahbazyan
 * Created: Mar 30, 2016
 */
public class Main {
    public static void main(String[] args) {
        SpeedCamera speedCamera = new CitySpeedCameraImpl();

        /**********************************
         * Speed limitations
         **********************************
         * Ambulance  -
         * Bus        60
         * Passenger  80
         * Police     -
         **********************************/

        Vehicle[] vehicles = new Vehicle[]{
                new Ambulance(60),
                new Passenger(80),
                new Bus(60),
                new Passenger(60),
                new Police(60),
                new Bus(80), // Will be shot by speed speed camera
                new Police(120),
                new Passenger(120), // Will be shot by speed speed camera
                new Ambulance(100)
        };

        for (Vehicle vehicle : vehicles) {
            if (vehicle.accept(speedCamera)) {
                System.out.println(">> The vehicle has been shot by speed camera!");
            }
            System.out.println();
        }
    }
}
