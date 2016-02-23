import impl.factories.DOCFactory;
import impl.factories.PDFFactory;
import impl.factories.XLSFactory;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 1:57 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client(new PDFFactory());
        client.run();

        client = new Client(new XLSFactory());
        client.run();

        client = new Client(new DOCFactory());
        client.run();
    }
}
