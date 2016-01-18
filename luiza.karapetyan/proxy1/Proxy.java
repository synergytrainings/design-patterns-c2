package com.synisys.de.deu_gdt.proxy1;

import java.util.Date;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public class Proxy {

    SlowThing slowThing;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        slowThing.sayHello();
    }

}
