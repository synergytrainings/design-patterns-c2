package com.synisys.training.patterns.structural.facade;

/**
 * @author Tatevik.Marikyan
 * @since 30-Jun-15.
 */
public class ComputerStartFacade {


    private DriverInstallationCheckingService driverInstallationCheckingService;
    private LoginCheckingService loginCheckingService;


    public ComputerStartFacade(String login, String psd) {
        this.driverInstallationCheckingService = new DriverInstallationCheckingService();
        this.loginCheckingService = new LoginCheckingService(login, psd);
    }

    public void startOperationSystem(){
        if(loginCheckingService.isCorrectLoginAndPsd()){
            if(this.driverInstallationCheckingService.areAllDriversInstalled()){
                System.out.println("Welcome to your operation system");
            } else {
                System.out.println("Please wait while the installations will be done");
            }
        } else {
            System.out.println("Please provide correct Login or Password");
        }
    }
}
