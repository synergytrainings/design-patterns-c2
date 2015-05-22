package factoryPattern.domain;

/**
 * Created by TikSat on 22.05.2015.
 */
public abstract class ShoesImpl implements Shoes{
    private String brand;
    private String type;
    private Integer size;
    private String color;

    protected ShoesImpl(String brand, String type, Integer size, String color) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
