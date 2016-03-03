import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public abstract class Item {

    private int itemId;
    private int categoryId;
    private String name;
    private BigDecimal price;


    public Item(int itemId,int categoryId,String name,BigDecimal price){
        this.itemId = itemId;
        this.categoryId=categoryId;
        this.name =  name;
        this.price =price;
    }


    public int getItemId() {
        return itemId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
