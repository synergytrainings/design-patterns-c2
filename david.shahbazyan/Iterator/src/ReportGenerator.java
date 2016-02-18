import java.util.Iterator;

import domain.ProductInfo;
import interfaces.ProductIterator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/18/16 <br/>
 * <b>Time:</b> 2:47 AM <br/>
 */
public class ReportGenerator {
    private ProductIterator productsSold;
    private ProductIterator productsLeft;

    public ReportGenerator(ProductIterator productsSold, ProductIterator productsLeft) {
        this.productsSold = productsSold;
        this.productsLeft = productsLeft;
    }

    public void showTotalReport() {
        showSoldReport();
        showLeftReport();
    }

    public void showSoldReport() {
        System.out.println("[PRODUCTS SOLD]");
        printProgucts(this.productsSold.getIterator());
        System.out.println();
    }

    public void showLeftReport() {
        System.out.println("[PRODUCTS LEFT]");
        printProgucts(this.productsLeft.getIterator());
        System.out.println();
    }

    private void printProgucts(Iterator<ProductInfo> products) {
        while (products.hasNext()) {
            ProductInfo info =  products.next();
            System.out.println(info);
        }
    }
}
