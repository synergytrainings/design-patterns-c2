package main.java.com.synisys.designPatternsTraining.prototype.impl;

/**
 * Created by Razmik on 6/5/2015.
 */
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton singletonInstance;

    private DoubleCheckedSingleton() {
    }

    //synchronized worked only on first step
    public static DoubleCheckedSingleton getInstance() {
        if (singletonInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return singletonInstance;
    }
}
