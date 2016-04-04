package behavioral.chainOfresponsibility;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
