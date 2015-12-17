package com.synisys.de.peru.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Hasmik Ghazaryan on 12/17/2015.
 */
public class BFlyWeightImpl implements FlyWeight {

    private List<Item> items;

    public BFlyWeightImpl() {
        items = new ArrayList<>();
    }

    public List<Item> getList(){
        for(int i = 1; i<4; i++){
            items.add(new Item(i, "B"+ String.valueOf(i)));
        }
        return items;
    }
}
