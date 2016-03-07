import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public class Car extends Item {
    public Car(int itemId, String name, BigDecimal price) {
        super(itemId, 1, name, price);
    }
}
