package com.synisys.training.patterns.behavioral.memento;

/**
 * @author Tatevik.Marikyan
 * @since 10-Mar-16.
 */
public class GamePlayerClient {

    public static void main(String... args){
        GamePlayer hero = new GamePlayer(GamePlayerType.BOY);
        GamePlayerCareTaker careTaker = new GamePlayerCareTaker(hero);

        // make the first change and save
        hero.setHeight(60);
        hero.setEyeColor("blue");
        hero.setHairColor("red");
        careTaker.save();

        // do next change and save
        hero.setEyeColor("green");
        careTaker.save();

        hero.setEyeColor("black");
        // undo last change
        careTaker.undo();

        // do another change and again save
        hero.setHairColor("orange");
        careTaker.save();

        hero.setHeight(80);
        careTaker.save();

        careTaker.undo();
        careTaker.undo();
        careTaker.redo();

        System.out.println(careTaker.printHeroState());
    }
}
