package flyweight;

import java.math.BigDecimal;

public class Suitcase implements Bag{
    private Integer maxWeight;
    private int x;
    private int y;
    private int z;
    private MATERIAL material;

    public Suitcase(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void fill() {
        System.out.println("Suitcase: fill() method. The bag can can contain maximum "+ maxWeight + "kg ." );
    }

    public enum MATERIAL{
        LEATEER,
        SYNTHETICS,
        COTTON;
    }

    //----------- Getters and setters --------------//
    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public MATERIAL getMaterial() {
        return material;
    }

    public void setMaterial(MATERIAL material) {
        this.material = material;
    }


}
