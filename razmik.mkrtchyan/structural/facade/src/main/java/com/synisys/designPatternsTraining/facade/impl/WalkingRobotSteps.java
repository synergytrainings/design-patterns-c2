package com.synisys.designPatternsTraining.facade.impl;

import com.synisys.designPatternsTraining.facade.api.RobotSteps;

/**
 * Created by Razmik on 12/9/2015.
 */
public class WalkingRobotSteps implements RobotSteps {
    @Override
    public void doFrontStep(int steps) {
        System.out.print("Do " +steps+" front");
    }

    @Override
    public void doBackStep(int steps) {
        System.out.print("Do " +steps+" back");
    }
}
