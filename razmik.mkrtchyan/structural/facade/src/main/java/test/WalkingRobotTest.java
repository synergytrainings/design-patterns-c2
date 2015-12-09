package test;

import com.synisys.designPatternsTraining.facade.impl.WalkingRobotFacade;
import com.synisys.designPatternsTraining.facade.impl.WalkingRobotLights;
import com.synisys.designPatternsTraining.facade.impl.WalkingRobotVolume;

/**
 * Created by Razmik on 12/9/2015.
 */
public class WalkingRobotTest {
    public static void main(String[] args) {
        WalkingRobotFacade walkingRobotFacade = new WalkingRobotFacade();
        walkingRobotFacade.setRobotLights(new WalkingRobotLights());
        walkingRobotFacade.setRobotVolume(new WalkingRobotVolume());

        walkingRobotFacade.turnOn();
        walkingRobotFacade.turnOff();
    }
}
