package abstractions;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:15 AM <br/>
 */
public abstract class AbstractFactory {
    public abstract AbstractDoc createDoc();
    public abstract AbstractExporter createExporter();
}
