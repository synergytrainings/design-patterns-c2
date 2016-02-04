package commandImpl;

import commandApi.ConditionerAbstractCommand;
import receiver.Conditioner;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public class ConditionerOffCommand extends ConditionerAbstractCommand {

    public ConditionerOffCommand(Conditioner conditioner) {
        super(conditioner);
    }


    @Override
    public void execute() {
        setPrevSpeed();
        this.conditioner.off();
    }
}
