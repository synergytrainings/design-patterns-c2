import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public interface Mediator {

    public void buyItem(int categoryId, BigDecimal maxPrice);
    public void sellItem(Item item);

}
