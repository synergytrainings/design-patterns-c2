package factoryPattern.domain;

/**
 * Created by TikSat on 22.05.2015.
 */
public class WomenShoes extends ShoesImpl{

    public WomenShoes(String brand, String type, Integer size, String color) {
        super(brand, type, size, color);
    }

    @Override
    public String shoesDetails() {
        StringBuilder shoesDetails = new StringBuilder();
        shoesDetails.append("Women shoes:");
        System.out.print("\n");

        shoesDetails.append("Brand:").append(getBrand()==null?"":getBrand()).append(" ");
        System.out.print("\n");

        shoesDetails.append("Type:").append(getType()==null?"":getType()).append(" ");
        System.out.print("\n");

        shoesDetails.append("Size:").append(getSize()==null?"":getSize()).append(" ");
        System.out.print("\n");

        shoesDetails.append("Color:").append(getColor()==null?"":getColor()).append(" ");

        return shoesDetails.toString();
    }
}
