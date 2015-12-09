package com.synisys.designPatternsTraining.facade.api;

/**
 * Created by Razmik on 12/9/2015.
 */
public interface RobotLights  extends OnOffBehavior{
    void setBrightness(int brightness);
}
