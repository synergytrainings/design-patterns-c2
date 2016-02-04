package commandImpl;

import commandApi.ConditionerAbstractCommand;
import receiver.Conditioner;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public class ConditionerMediumCommand extends ConditionerAbstractCommand {
    public ConditionerMediumCommand(Conditioner conditioner) {
        super(conditioner);
    }

    @Override
    public void execute() {
        setPrevSpeed();
        this.conditioner.off();
    }
}
