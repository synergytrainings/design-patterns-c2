import com.sun.istack.internal.NotNull;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/12/15 <br/>
 * <b>Time:</b> 7:22 AM <br/>
 */
public abstract class Logger {
    protected Writer writer;

    public Logger(@NotNull Writer writer) {
        this.writer = writer;
    }

    abstract void writeLog(String str);
}
