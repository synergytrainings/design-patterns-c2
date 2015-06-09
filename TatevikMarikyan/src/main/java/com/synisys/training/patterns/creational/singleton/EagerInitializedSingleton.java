package com.synisys.training.patterns.creational.singleton;

/**
 * @author Tatevik.Marikyan
 * @since 05-Jun-15.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }


}
