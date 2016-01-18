package com.synisys.de.deu_gdt.proxy1;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public class SlowThing extends Thing {

    public SlowThing() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
