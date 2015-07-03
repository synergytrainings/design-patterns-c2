package com.synisys.training.patterns.structural.facade;

import com.synisys.training.patterns.structural.facade.domain.Computer;
import com.synisys.training.patterns.structural.facade.domain.Driver;

/**
 * @author Tatevik.Marikyan
 * @since 30-Jun-15.
 */
public class DriverInstallationCheckingService {

    private Computer computer;

    public DriverInstallationCheckingService() {
        computer = new Computer();
    }

    public boolean areAllDriversInstalled(){
        for (Driver driver: computer.getDriverList()){
            if (driver.needInstallation()){
                return false;
            }
        }
        return true;
    }
}
