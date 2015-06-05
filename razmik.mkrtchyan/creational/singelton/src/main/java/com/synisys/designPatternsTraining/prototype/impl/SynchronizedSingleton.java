package main.java.com.synisys.designPatternsTraining.prototype.impl;

/**
 * Created by Razmik on 6/4/2015.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton singletonInstance;

    private SynchronizedSingleton() {
    }

    //synchronized worked only on first step
    public static synchronized SynchronizedSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SynchronizedSingleton();
        }
        return singletonInstance;
    }

}

