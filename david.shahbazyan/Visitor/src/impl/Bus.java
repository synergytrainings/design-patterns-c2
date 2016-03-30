package impl;

import api.SpeedCamera;
import api.Vehicle;

/**
 * Author: David.Shahbazyan
 * Created: Mar 30, 2016
 */
public class Bus implements Vehicle {
    private final double speed;

    public Bus(double speed) {
        this.speed = speed;
    }

    double getSpeed() {
        return speed;
    }

    @Override
    public boolean accept(SpeedCamera speedCamera) {
        return speedCamera.visit(this);
    }
}
