package com.synisys.training.patterns.behavioral.command.receiver;

/**
 * Created by Tatevik
 * since  04-Feb-16.
 */
public class Result {

    private StringBuilder result;

    public Result() {
        this.result = new StringBuilder();
    }

    public void printResult(){
        System.out.println(result.toString());
    }

    public StringBuilder getResult() {
        return result;
    }


}
