package com.synisys.training.patterns.behavioral.command.invoker;

import com.synisys.training.patterns.behavioral.command.command.Print;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Tatevik
 * since  04-Feb-16.
 */
public class Printer {

    private final Deque<Print> characterPressedHistoryStack = new ArrayDeque<>();


    public void enterCharacter(Print currentCharacter) {
        characterPressedHistoryStack.push(currentCharacter);
        currentCharacter.print();
    }

    public void pressBackSpace() {
        characterPressedHistoryStack.pop().backspace();
    }
}
