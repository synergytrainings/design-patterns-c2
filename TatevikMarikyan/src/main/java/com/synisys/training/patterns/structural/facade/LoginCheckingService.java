package com.synisys.training.patterns.structural.facade;

import com.synisys.training.patterns.structural.facade.domain.Computer;

/**
 * @author Tatevik.Marikyan
 * @since 30-Jun-15.
 */
public class LoginCheckingService {

    private String login;
    private String psd;

    private Computer computer;

    public LoginCheckingService(String login, String psd) {
        this.login = login;
        this.psd = psd;
        this.computer = new Computer();
    }

    public boolean isCorrectLoginAndPsd(){
        return computer.getLogin().equals(this.login) && computer.getPsd().equals(this.psd);
    }
}
