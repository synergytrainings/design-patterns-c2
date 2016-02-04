package commandApi;

import receiver.Conditioner;
import receiver.Speed;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public abstract class ConditionerAbstractCommand implements Command {

    protected Conditioner conditioner;
    protected Speed prevSpeed;

    public ConditionerAbstractCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void undo() {
        switch (this.prevSpeed) {
            case HIGH:
                conditioner.high();
            case MEDIUM:
                conditioner.medium();
            case LOW:
                conditioner.low();
            case OFF:
                conditioner.off();
        }
    }

    public Speed getPrevSpeed() {
        return prevSpeed;
    }

    protected void setPrevSpeed() {
        this.prevSpeed = conditioner.getSpeed();
    }
}
