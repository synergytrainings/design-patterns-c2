import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public abstract class Customer {

    private Mediator _mediator;
    private int _discount;

    public Customer(Mediator mediator){
        _mediator=mediator;
    }

    public void buyItem(int categoryId, BigDecimal maxPrice){
        _mediator.buyItem(categoryId,maxPrice);
    }
    public void sellItem(Item item){
        _mediator.sellItem(item);
    }

    public int get_discount() {
        return _discount;
    }

    public void set_discount(int _discount) {
        this._discount = _discount;
    }
}
