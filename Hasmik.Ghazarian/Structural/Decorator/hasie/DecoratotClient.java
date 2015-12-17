package hasie.decorator;

/**
 * Author: Hasmik Ghazaryan on 6/30/2015.
 */
public class DecoratotClient {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger =
                factory.getLogger(LoggerFactory.TYPE_FILE_LOGGER);
        HTMLLogger htmlLogger = new HTMLLogger(logger);
        htmlLogger.log("A message to log");
        EncryptLogger encryptLogger = new EncryptLogger(logger);
        encryptLogger.log("A message to log");
    }

}
