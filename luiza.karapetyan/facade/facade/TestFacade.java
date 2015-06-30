package com.synisys.de.rwandaIngo.facade;

/**
 * Created by Luiza.Karapetyan on 6/30/2015.
 */
class TestFacade {
    public static void main(String[] args) {
        FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
        FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
        System.out.println(teaCup);
    }
}
