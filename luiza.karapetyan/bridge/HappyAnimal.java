package com.synisys.de.rwandaIngo.bridge;

/**
 * Created by Luiza.Karapetyan on 6/12/2015.
 */
public class HappyAnimal extends Animal {
    public HappyAnimal(AnimalImp animalImp) {
        super(animalImp);
    }

    public void say() {
        animalImp.say();
    }
}

