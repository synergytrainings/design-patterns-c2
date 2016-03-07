/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public class PoorCustomer extends Customer {
    public PoorCustomer(Mediator mediator) {
        super(mediator);
        set_discount(10);
    }
}
