package com.synisys.training.patterns.structural.facade.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tatevik.Marikyan
 * @since 30-Jun-15.
 */
public class Computer {

    private String login = "aabb";
    private String psd = "aabb";

    public ArrayList driverList ;

    public Computer() {
        this.driverList = new ArrayList<>();
        initDrivers();
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }

    public String getLogin() {
        return login;
    }

    public String getPsd() {
        return psd;
    }

    private void initDrivers(){
        this.driverList.add(new Driver());
        this.driverList.add(new Driver());
    }
}
