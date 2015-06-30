package hasie.decorator;

/**
 * Author: Hasmik Ghazaryan on 6/30/2015.
 */
public class LoggerFactory {
    public static final String TYPE_CONSOL_LOGGER = "console";
    public static final String TYPE_FILE_LOGGER = "file";
    public Logger getLogger(String type) {
        if(TYPE_CONSOL_LOGGER.equals(type)) {
            return new ConsoleLogger();
        } else {
            return new FileLogger();
        }
    }

}
