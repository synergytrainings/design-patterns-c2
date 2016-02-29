package impl.factories;

import abstractions.AbstractDoc;
import abstractions.AbstractExporter;
import abstractions.AbstractFactory;
import impl.docs.DOCDocument;
import impl.exporters.DOCExporter;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:23 AM <br/>
 */
public class DOCFactory extends AbstractFactory {
    @Override
    public AbstractDoc createDoc() {
        return new DOCDocument();
    }

    @Override
    public AbstractExporter createExporter() {
        return new DOCExporter();
    }
}
