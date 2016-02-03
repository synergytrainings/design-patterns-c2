package com.synisys.training.patterns.behavioral.command.command;

import com.synisys.training.patterns.behavioral.command.receiver.Result;

/**
 * Created by Tatevik
 * since  04-Feb-16.
 */
public class KeyboardPrint extends AbstractPrint {

    private char character;

    public KeyboardPrint(Result result, char character) {
        super(result);
        this.character = character;
    }

    @Override
    public void print() {
        this.result.getResult().append(this.character);
    }

    @Override
    public void backspace() {
        String resultStr =this.result.getResult().toString();
        this.result.getResult().delete(resultStr.length() - 1, resultStr.length());
    }
}
