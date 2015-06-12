package com.synisys.de.rwandaIngo.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luiza.Karapetyan on 6/12/2015.
 */
public class Client {
    public static void main(String[] args) {
        List<Animal> happyAnimals = new ArrayList();
        happyAnimals.add(new HappyAnimal(new Cat()));
        happyAnimals.add(new HappyAnimal(new Pig()));
        happyAnimals.add(new HappyAnimal(new Rooster()));

        for (Animal animal: happyAnimals) {
            animal.say();
        }
    }
}
