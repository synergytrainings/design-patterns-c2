/**
 * Created by davit.harutyunyan on 3/14/2016.
 */
public class StockObserver implements Observer{

    private double ibmPrice;
    private double cpePrice;
    private double msft;

    private static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;


    public StockObserver(Subject stockGrabber){
        this.stockGrabber=stockGrabber;
        this.observerId=++observerIdTracker;
        System.out.println("New Observer registered with "+observerId+" ID");
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double cpePrice, double msft) {
        this.ibmPrice=ibmPrice;
        this.cpePrice=cpePrice;
        this.msft=msft;

        printThePrices();
    }

    private void printThePrices() {
    System.out.println(observerId+"\nIBM: "+ibmPrice+
            "\nCPE: "+cpePrice+"\nMicrosoft Price: "+msft);
    }
}
