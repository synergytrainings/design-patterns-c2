import com.sun.istack.internal.NotNull;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/12/15 <br/>
 * <b>Time:</b> 7:37 AM <br/>
 */
public class FileLogger extends Logger {
    public FileLogger(@NotNull Writer writer) {
        super(writer);
    }

    @Override
    void writeLog(String str) {
        System.out.println("Using FileLogger.");
        writer.write(str);
    }
}
