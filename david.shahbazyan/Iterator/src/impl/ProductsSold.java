package impl;

import domain.ProductInfo;
import interfaces.ProductIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/18/16 <br/>
 * <b>Time:</b> 2:18 AM <br/>
 */
public class ProductsSold implements ProductIterator {
    List<ProductInfo> products = new ArrayList<>();

    public ProductsSold() {
        this.products.add(new ProductInfo("Bread", "ArmTonratun ltd", 5));
        this.products.add(new ProductInfo("Butter", "BestFarmEver co", 1));
        this.products.add(new ProductInfo("Cheese", "BestFarmEver co", 3));
        this.products.add(new ProductInfo("Potato", "BestFarmEver co", 9));
        this.products.add(new ProductInfo("ChocolateCake", "BobbyBakery ltd", 8));
    }

    @Override
    public Iterator getIterator() {
        return this.products.iterator();
    }
}
