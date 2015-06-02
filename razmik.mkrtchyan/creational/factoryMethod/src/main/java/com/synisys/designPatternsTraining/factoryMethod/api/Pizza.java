package main.java.com.synisys.designPatternsTraining.factoryMethod.api;

/**
 * Created by Razmik on 5/22/2015.
 */
public abstract class Pizza {
    String name;
    String sauce;
    String dough;

    public Pizza(String name, String sauce, String dough) {
        this.name = name;
        this.sauce = sauce;
        this.dough = dough;
    }

    public void prepare() {
        System.out.println("Preparing " + name + "pizza");
        System.out.println("Souce " + sauce);
        System.out.println("Dough " + dough);

    }

    public abstract void bake();


    public abstract void cut() ;

    public abstract void box() ;

}

