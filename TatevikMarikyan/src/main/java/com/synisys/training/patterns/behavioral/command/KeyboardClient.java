package com.synisys.training.patterns.behavioral.command;

import com.synisys.training.patterns.behavioral.command.command.KeyboardPrint;
import com.synisys.training.patterns.behavioral.command.invoker.Printer;
import com.synisys.training.patterns.behavioral.command.receiver.Result;

import java.util.Scanner;

/**
 * Created by Tatevik
 * since  04-Feb-16.
 */
public class KeyboardClient {

    public static void main(String[] args) {
        Result result = new Result();
        Printer printer = new Printer();

/*        Scanner input = new Scanner(System.in);
        char aChar = input.findInLine("[^\\s]").charAt(0);
        printer.enterCharacter(new KeyboardPrint(result, aChar));*/

        Scanner input = new Scanner(System.in);
        char[] chars = input.next().toCharArray();
        for (char aChar : chars) {
            printer.enterCharacter(new KeyboardPrint(result, aChar));
        }

        result.printResult();
        printer.pressBackSpace();
        printer.pressBackSpace();
        result.printResult();
    }
}
