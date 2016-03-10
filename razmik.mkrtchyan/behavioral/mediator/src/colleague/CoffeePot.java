package colleague;

import mediator.EventType;
import mediator.EventMediator;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Mar 03, 2016.
 *  
 */
public class CoffeePot extends Colleague {
    public CoffeePot(EventMediator mediator) {
        super(mediator);
    }

    @Override
    public void onEvent() {
       mediator.onEvent(this, EventType.COFFEE_POT);
    }

    @Override
    public void action() {
        System.out.println("coffee pot");
    }
}
