package behavioral.chainOfresponsibility;

/**
 * Created by Hasmik.Ghazaryan on 4/4/2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
