package com.synisys.designPatternsTraining.facade.impl;

import com.sun.istack.internal.Nullable;
import com.synisys.designPatternsTraining.facade.api.RobotFacade;
import com.synisys.designPatternsTraining.facade.api.RobotLights;
import com.synisys.designPatternsTraining.facade.api.RobotSteps;
import com.synisys.designPatternsTraining.facade.api.RobotVolume;

/**
 * Created by Razmik on 12/9/2015.
 */
public class WalkingRobotFacade implements RobotFacade {
    @Nullable
    private RobotVolume robotVolume;
    @Nullable
    private RobotSteps robotSteps;
    @Nullable
    private RobotLights robotLights;

    @Override
    public void turnOn() {
        this.robotLights.setBrightness(10);
        this.robotLights.turnOn();

        this.robotVolume.setVolume(5);
        this.robotVolume.turnOn();

        this.robotSteps.doFrontStep(5);
        this.robotSteps.doFrontStep(3);
    }

    @Override
    public void turnOff() {
        this.robotLights.turnOff();

        this.robotVolume.turnOff();
    }

    public void setRobotVolume(RobotVolume robotVolume) {
        this.robotVolume = robotVolume;
    }

    public void setRobotSteps(RobotSteps robotSteps) {
        this.robotSteps = robotSteps;
    }

    public void setRobotLights(RobotLights robotLights) {
        this.robotLights = robotLights;
    }
}
