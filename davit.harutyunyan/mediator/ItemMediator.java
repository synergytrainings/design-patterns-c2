import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public class ItemMediator implements Mediator {

    private ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public void buyItem(int categoryId,BigDecimal maxPrice) {
        for (Item item : items) {
            if(item.getPrice().compareTo(maxPrice)==-1 && item.getCategoryId()==categoryId){
                System.out.println(item.getName()+" bought for " + item.getPrice()+"$");
                break;
            }
        }
    }

    @Override
    public void sellItem(Item item) {
        items.add(item);
    }
}
