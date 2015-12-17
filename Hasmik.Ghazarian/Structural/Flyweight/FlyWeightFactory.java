package com.synisys.de.peru.flyweight;

import org.omnifaces.component.output.cache.CacheFactory;
import org.omnifaces.component.output.cache.CacheProvider;

import javax.cache.CacheManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Hasmik Ghazaryan on 12/17/2015.
 */
public class FlyWeightFactory {

    public static List<Item> getItemList(String key)
    {
        FlyWeight flyWeight = null;
        Map<String, List<Item>> cache = new HashMap<>();

            if (cache.get(key) != null)
            {
                return cache.get(key);
            }
            else
            {
                if(key == "A"){
                    flyWeight = new AFlyWeightImpl();
                } else {
                    flyWeight = new BFlyWeightImpl();
                }
            }

        cache.put(key, flyWeight.getList());
        return flyWeight.getList();
    }

}
