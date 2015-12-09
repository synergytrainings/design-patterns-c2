package com.synisys.designPatternsTraining.facade.impl;

import com.sun.istack.internal.NotNull;
import com.synisys.designPatternsTraining.facade.api.RobotVolume;

/**
 * Created by Razmik on 12/9/2015.
 */
public class WalkingRobotVolume implements RobotVolume {
    @NotNull
    private Integer volume;


    @Override
    public void setVolume(@NotNull Integer volume) {
 this.volume=volume;
    }

    @Override
    public void turnOn() {
        System.out.print("volume Turned on");
    }

    @Override
    public void turnOff() {
        System.out.print("volume turned off");
    }
}
