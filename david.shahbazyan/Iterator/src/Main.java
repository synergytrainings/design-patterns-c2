import impl.ProductsLeft;
import impl.ProductsSold;
import interfaces.ProductIterator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/18/16 <br/>
 * <b>Time:</b> 1:06 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator(new ProductsSold(), new ProductsLeft());
        generator.showSoldReport();
        generator.showLeftReport();
        generator.showTotalReport();
    }
}
