package impl.exporters;

import abstractions.AbstractDoc;
import abstractions.AbstractExporter;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:24 AM <br/>
 */
public class XLSExporter extends AbstractExporter {
    @Override
    public void doExport(AbstractDoc doc) {
        System.out.println("[ XLS ] : " + doc.getContent());
    }
}
