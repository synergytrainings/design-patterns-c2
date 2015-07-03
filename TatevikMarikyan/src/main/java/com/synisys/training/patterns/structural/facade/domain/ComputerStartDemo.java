package com.synisys.training.patterns.structural.facade.domain;

import com.synisys.training.patterns.structural.facade.ComputerStartFacade;

/**
 * @author Tatevik.Marikyan
 * @since 03-Jul-15.
 */
public class ComputerStartDemo {
    public static void main(String[] args) {
        ComputerStartFacade startingComputer = new ComputerStartFacade("aabb", "aabb");
        startingComputer.startOperationSystem();
    }
}
