package colleague;

import mediator.EventMediator;

/**
 * Created by Razmik on 3/2/2016.
 */
public abstract class Colleague {

    protected EventMediator mediator;

    public Colleague(EventMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void onEvent();

    public abstract void action();
}
