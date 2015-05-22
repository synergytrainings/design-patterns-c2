package factoryPattern.factory;

import factoryPattern.domain.Shoes;
import factoryPattern.domain.WomenShoes;

/**
 * Created by TikSat on 22.05.2015.
 */
public class WomenShoesFactory extends ShoesFactory {


    @Override
    public Shoes makeShoes(String brand, String type, Integer size, String color) {
        return new WomenShoes(brand,type,size,color);
    }
}
