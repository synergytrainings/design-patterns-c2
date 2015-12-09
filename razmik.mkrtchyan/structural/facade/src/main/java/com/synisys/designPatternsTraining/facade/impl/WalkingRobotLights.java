package com.synisys.designPatternsTraining.facade.impl;

import com.sun.istack.internal.NotNull;
import com.synisys.designPatternsTraining.facade.api.RobotLights;

/**
 * Created by Razmik on 12/9/2015.
 */
public class WalkingRobotLights implements RobotLights {

    @NotNull
    private Integer brightness;

    @Override
    public void setBrightness(int brightness) {
        this.brightness=brightness;
    }

    @Override
    public void turnOn() {
        System.out.print("Lights turned on with"+ this.brightness+ " brightness");
    }

    @Override
    public void turnOff() {
        System.out.print("Lights turned off");
    }
}
