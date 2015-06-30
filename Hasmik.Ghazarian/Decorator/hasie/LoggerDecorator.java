package hasie.decorator;

/**
 * Author: Hasmik Ghazaryan on 6/30/2015.
 */
public class LoggerDecorator implements Logger {
    Logger logger;
    public LoggerDecorator(Logger logger) {
        super();
        this.logger = logger;
    }
    public void log(String msg) {
        logger.log(msg);
    }
}
