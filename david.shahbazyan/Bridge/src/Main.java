/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/12/15 <br/>
 * <b>Time:</b> 7:39 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        Writer writer = null;
        Logger logger = null;

        if (args.length > 1) {
            if ("win".equals(args[0])) {
                writer = new WindowsWriter();
            } else if ("nix".equals(args[0])) {
                writer = new LinuxWriter();
            } else {
                throw new RuntimeException("Yor OS is not supported!");
            }

            if ("cons".equals(args[1])) {
                logger = new ConsoleLogger(writer);
            } else if ("file".equals(args[1])) {
                logger = new FileLogger(writer);
            } else {
                throw new RuntimeException("Log method is not supported!");
            }
        } else {
            throw new RuntimeException("Invalid parameters quantity (" + args.length + "/2)!");
        }

        if (logger == null) {
            return;
        }

        logger.writeLog("Some log text.");
    }
}
