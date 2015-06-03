import controller.MessageGenerator;
import domain.IdmSevenSettings;
import domain.MessageRange;
import domain.Settings;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 6:21 AM <br/>
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MessageGenerator generator = new MessageGenerator(IdmSevenSettings.getInstance());

        System.out.println("-----------------------------------------------");
        System.out.println("---          Before customization.          ---");
        System.out.println("-----------------------------------------------");
        printSettingsInfo(generator.getSettings());

        generator.customize();
        generator.getSettings().setRange(new MessageRange(201000, 205000));

        System.out.println("-----------------------------------------------");
        System.out.println("---           After customization.          ---");
        System.out.println("-----------------------------------------------");
        printSettingsInfo(generator.getSettings());

        System.out.println("-----------------------------------------------");
        System.out.println("--- Default settings have not been changed. ---");
        System.out.println("-----------------------------------------------");
        printSettingsInfo(IdmSevenSettings.getInstance());
    }

    private static void printSettingsInfo(Settings settings) {
        System.out.println(settings.getSettingsName());
        System.out.println("Range = [" + settings.getRange().getFrom() + "," + settings.getRange().getTo() + "]");
    }
}
