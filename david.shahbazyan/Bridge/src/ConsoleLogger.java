import com.sun.istack.internal.NotNull;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/12/15 <br/>
 * <b>Time:</b> 7:35 AM <br/>
 */
public class ConsoleLogger extends Logger {
    public ConsoleLogger(@NotNull Writer writer) {
        super(writer);
    }

    @Override
    void writeLog(String str) {
        System.out.println("Using ConsoleLogger.");
        writer.write(str);
    }
}
