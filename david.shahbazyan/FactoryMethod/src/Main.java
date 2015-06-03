import creators.*;
import domain.Dialog;
import domain.Severity;

import java.util.Random;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 6:23 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randInt = random.nextInt(5);

        System.out.println(String.format("Non parametrized call for [%s] value:", randInt));
        callNonParametrizedImplementation(randInt);

        System.out.println();

        System.out.println(String.format("Parametrized call for [%s] value:", randInt));
        callParametrizedImplementation(randInt);
    }

    private static void callParametrizedImplementation(int randInt) {
        Dialog dialog;
        if (randInt == 0) {
            dialog = ParametrizedDialogCreator.createDialog(Severity.FATAL);
        } else if (randInt == 1) {
            dialog = ParametrizedDialogCreator.createDialog(Severity.ERROR);
        } else if (randInt == 2) {
            dialog = ParametrizedDialogCreator.createDialog(Severity.WARNING);
        } else if (randInt == 3) {
            dialog = ParametrizedDialogCreator.createDialog(Severity.INFORMATION);
        } else {
            dialog = ParametrizedDialogCreator.createDialog(Severity.UNSPECIFIED);
        }
        printDialogMessage(dialog);
    }

    private static void callNonParametrizedImplementation(int randInt) {
        Dialog dialog;
        AbstractDialogCreator dialogCreator;
        if (randInt == 0) {
            dialogCreator = new FatalDialogCreator();
            dialog = dialogCreator.createDialog();
        } else if (randInt == 1) {
            dialogCreator = new ErrorDialogCreator();
            dialog = dialogCreator.createDialog();
        } else if (randInt == 2) {
            dialogCreator = new WarningDialogCreator();
            dialog = dialogCreator.createDialog();
        } else if (randInt == 3) {
            dialogCreator = new InformationDialogCreator();
            dialog = dialogCreator.createDialog();
        } else {
            dialogCreator = new UnspecifiedDialogCreator();
            dialog = dialogCreator.createDialog();
        }
        printDialogMessage(dialog);
    }

    private static void printDialogMessage(Dialog dialog) {
        System.out.println(dialog.getMessage());
    }

}
