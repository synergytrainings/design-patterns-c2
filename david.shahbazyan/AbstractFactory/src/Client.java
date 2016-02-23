import abstractions.AbstractDoc;
import abstractions.AbstractExporter;
import abstractions.AbstractFactory;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:31 AM <br/>
 */
public class Client {
    private AbstractExporter exporter;
    private AbstractDoc doc;

    public Client(AbstractFactory factory) {
        this.exporter = factory.createExporter();
        this.doc = factory.createDoc();
    }

    public void run() {
        this.exporter.doExport(doc);
    }
}
