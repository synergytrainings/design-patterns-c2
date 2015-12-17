package com.synisys.de.peru.flyweight;

import java.math.BigDecimal;

/**
 * Author: Hasmik Ghazaryan on 12/17/2015.
 */
public class Hexagon {

    private BigDecimal length;
    private BigDecimal x;
    private BigDecimal y;

    public Hexagon(BigDecimal length, BigDecimal x, BigDecimal y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }
}