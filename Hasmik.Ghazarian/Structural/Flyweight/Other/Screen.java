package com.synisys.de.peru.flyweight;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author: Hasmik Ghazaryan on 12/17/2015.
 */
public class Screen {

    private List<Hexagon> list;

    BigDecimal x;
    BigDecimal y;
    BigDecimal length;

    public Hexagon getCurrentHexagon(int number){
        if(list.get(number) == null){
            // calculate x, y, having length and number and pass to constructor
            return new Hexagon(length, x, y);
        }
        return list.get(number);
    }
}
