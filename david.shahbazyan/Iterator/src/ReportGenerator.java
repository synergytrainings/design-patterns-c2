import domain.ProductInfo;
import interfaces.ProductIterator;

import java.util.Iterator;

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
        Iterator<ProductInfo> iterator = this.productsSold.getIterator();
        System.out.println("[PRODUCTS SOLD]");
        while (iterator.hasNext()) {
            ProductInfo info =  iterator.next();
            printProdInfo(info);
        }
        System.out.println();
    }

    public void showLeftReport() {
        Iterator<ProductInfo> iterator = this.productsLeft.getIterator();
        System.out.println("[PRODUCTS LEFT]");
        while (iterator.hasNext()) {
            ProductInfo info =  iterator.next();
            printProdInfo(info);
        }
        System.out.println();
    }

    private void printProdInfo(ProductInfo info) {
        System.out.println("[NAME: " + info.getProductName() + "], [MANUFACTURER: " + info.getManufacturerName() + "], [QUANTITY: " + info.getQuantity() + "]");
    }
}
