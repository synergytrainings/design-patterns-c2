/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/12/15 <br/>
 * <b>Time:</b> 7:20 AM <br/>
 */
public class LinuxWriter implements Writer {
    private static final String LINE_SEPARATOR = "\\n";

    @Override
    public void write(String str) {
        System.out.println("Writer type LinuxWriter.");
        System.out.println("Line separator to be used: " + LINE_SEPARATOR);
        System.out.println("String: " + str);
    }
}
