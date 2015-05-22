package factoryPattern.factory;

import factoryPattern.domain.Shoes;

/**
 * Created by TikSat on 22.05.2015.
 */
public interface Factory {
    public Shoes makeShoes(String brand, String type, Integer size, String color);

}
