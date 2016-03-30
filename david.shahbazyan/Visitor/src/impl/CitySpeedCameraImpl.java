package impl;

import api.SpeedCamera;

/**
 * Author: David.Shahbazyan
 * Created: Mar 30, 2016
 */
public class CitySpeedCameraImpl implements SpeedCamera {
    private final String reportTemplate = "Vehicle type: %s%n" + "Vehicle speed: %s%n" + "Will be shot: %s%n";

    private boolean willBeShot(double currentSpeed, double speedLimit) {
        return currentSpeed > speedLimit;
    }

    @Override
    public boolean visit(Ambulance ambulance) {
        System.out.printf(reportTemplate, "Ambulance", ambulance.getSpeed(), "NO");
        return false;
    }

    @Override
    public boolean visit(Bus bus) {
        System.out.printf(reportTemplate, "Bus", bus.getSpeed(), willBeShot(bus.getSpeed(), 60) ? "YES" : "NO");
        return willBeShot(bus.getSpeed(), 60);
    }

    @Override
    public boolean visit(Passenger passenger) {
        System.out.printf(reportTemplate, "Passenger", passenger.getSpeed(), willBeShot(passenger.getSpeed(), 80) ? "YES" : "NO");
        return willBeShot(passenger.getSpeed(), 80);
    }

    @Override
    public boolean visit(Police police) {
        System.out.printf(reportTemplate, "Police", police.getSpeed(), "NO");
        return false;
    }
}
