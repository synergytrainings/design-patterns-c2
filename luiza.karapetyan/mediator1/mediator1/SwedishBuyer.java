package com.synisys.de.rwandaIngo.mediator1;

/**
 * Created by Luiza.Karapetyan on 3/3/2016.
 */
public class SwedishBuyer extends Buyer {

    public SwedishBuyer(Mediator mediator) {
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
