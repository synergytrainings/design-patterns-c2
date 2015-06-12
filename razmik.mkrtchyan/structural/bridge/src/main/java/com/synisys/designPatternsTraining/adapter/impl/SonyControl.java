package main.java.com.synisys.designPatternsTraining.adapter.impl;

import main.java.com.synisys.designPatternsTraining.adapter.api.RemoteControl;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Jun 12, 2015.
 *  
 */
public class SonyControl extends RemoteControl {

    private Integer currentStation;


    public void setStation(Integer currentStation) {
        this.currentStation = currentStation;
    }

    public void nextChannel() {
        setChannel(currentStation + 1);
    }

    public void previousChannel() {
        setChannel(currentStation - 1);
    }
}
