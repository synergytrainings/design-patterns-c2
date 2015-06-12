package com.synisys.de.rwandaIngo.bridge;

/**
 * Created by Luiza.Karapetyan on 6/12/2015.
 */

public abstract class Animal {
    AnimalImp animalImp;
    public Animal(AnimalImp animalImp) {
        this.animalImp = animalImp;
    }
    public abstract void say();
}
