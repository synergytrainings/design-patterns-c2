package api;

import impl.Ambulance;
import impl.Bus;
import impl.Passenger;
import impl.Police;

/**
 * Author: David.Shahbazyan
 * Created: Mar 30, 2016
 */
public interface SpeedCamera {
    boolean visit(Ambulance ambulance);
    boolean visit(Bus bus);
    boolean visit(Passenger passenger);
    boolean visit(Police police);
}
