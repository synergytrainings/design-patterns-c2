package impl.factories;

import abstractions.AbstractDoc;
import abstractions.AbstractExporter;
import abstractions.AbstractFactory;
import impl.docs.XLSDocument;
import impl.exporters.XLSExporter;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:23 AM <br/>
 */
public class XLSFactory extends AbstractFactory {
    @Override
    public AbstractDoc createDoc() {
        return new XLSDocument();
    }

    @Override
    public AbstractExporter createExporter() {
        return new XLSExporter();
    }
}
