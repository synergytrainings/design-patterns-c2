package com.synisys.training.patterns.behavioral.command.command;

import com.synisys.training.patterns.behavioral.command.receiver.Result;

/**
 * Created by Tatevik
 * since  04-Feb-16.
 */
public abstract class AbstractPrint implements Print {

    protected Result result;

    protected AbstractPrint(Result result) {
        this.result = result;
    }

}
