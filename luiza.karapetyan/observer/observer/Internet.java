package com.synisys.de.rwandaIngo.observer;

/**
 * Created by Luiza.Karapetyan on 3/15/2016.
 */
public class Internet implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is: "
                + interest);
    }
}


