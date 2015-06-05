package main.java.com.synisys.designPatternsTraining.prototype.impl;

/**
 * Created by Razmik on 6/5/2015.
 */
public class Singleton {
    private static Singleton singletonInstance = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        return singletonInstance;
    }

}
