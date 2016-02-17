package impl;

import domain.ProductInfo;
import interfaces.ProductIterator;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/18/16 <br/>
 * <b>Time:</b> 2:18 AM <br/>
 */
public class ProductsLeft implements ProductIterator {
    TreeMap<Integer, ProductInfo> products = new TreeMap<>();

    public ProductsLeft() {
        this.products.put(1, new ProductInfo("Bread", "ArmTonratun ltd", 6));
        this.products.put(2, new ProductInfo("Butter", "BestFarmEver co", 1));
        this.products.put(3, new ProductInfo("Cheese", "BestFarmEver co", 0));
        this.products.put(4, new ProductInfo("Potato", "BestFarmEver co", 8));
    }

    @Override
    public Iterator getIterator() {
        return this.products.values().iterator();
    }
}
