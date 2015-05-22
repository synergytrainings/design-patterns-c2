package factoryPattern.factory;

import factoryPattern.domain.MenShoes;
import factoryPattern.domain.Shoes;

/**
 * Created by TikSat on 22.05.2015.
 */
public class MenShoesFactory extends ShoesFactory {

    @Override
    public Shoes makeShoes(String brand, String type, Integer size, String color) {
        return new MenShoes(brand,type,size,color);
    }
}
