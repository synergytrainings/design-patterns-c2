package com.synisys.de.rwandaIngo.facade;

/**
 * Created by Luiza.Karapetyan on 6/30/2015.
 */
public class FacadeCuppaMaker {
    boolean teaBagIsSteeped;

    public FacadeCuppaMaker() {
        System.out.println(
                "FacadeCuppaMaker ready to make you a cuppa!");
    }

    public FacadeTeaCup makeACuppa() {
        FacadeTeaCup cup = new FacadeTeaCup();
        FacadeTeaBag teaBag = new FacadeTeaBag();
        FacadeWater water = new FacadeWater();
        cup.addFacadeTeaBag(teaBag);
        water.boilFacadeWater();
        cup.addFacadeWater(water);
        cup.steepTeaBag();
        return cup;
    }
}