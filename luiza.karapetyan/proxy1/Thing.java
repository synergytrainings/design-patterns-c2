package com.synisys.de.deu_gdt.proxy1;

import java.util.Date;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public abstract class Thing {

    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }

}

