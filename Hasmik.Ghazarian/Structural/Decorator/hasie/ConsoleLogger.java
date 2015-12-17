package hasie.decorator;

/**
 * Author: Hasmik Ghazaryan on 6/30/2015.
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("Console Logger!!!"+
                msg);
    }
}
