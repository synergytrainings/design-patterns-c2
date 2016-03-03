import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 3/2/2016.
 */
public class Main {

    public static void main(String[] args) {

        Mediator mediator= new ItemMediator();
        Customer richMan = new RichCustomer(mediator);
        Customer poorMan = new PoorCustomer(mediator);
        Item item = prepareItem();
        poorMan.sellItem(item);
        System.out.println("Customer is selling his: "+item.getName()+" with "+poorMan.get_discount()+"% discount.");
        System.out.println("Customer is going to buy something with 16000 max cost and categoryId 1.");
        richMan.buyItem(1,new BigDecimal("16000"));

    }

    public static Item prepareItem(){
        Item car  = new Car(1,"BMW", new BigDecimal("15000"));
        return  car;
    }

}
