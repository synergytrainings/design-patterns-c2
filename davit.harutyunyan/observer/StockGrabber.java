import java.util.ArrayList;

/**
 * Created by davit.harutyunyan on 3/14/2016.
 */
public class StockGrabber implements Subject{


    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double cpePrice;
    private double msft;


    public StockGrabber(){
        observers=new ArrayList<Observer>();
    }
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deletedObserver) {
        int observerIndex = observers.indexOf(deletedObserver);
        System.out.println("Observer"+(observerIndex+1)+"deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
         observer.update(ibmPrice,cpePrice,msft);
        }
    }

    public void setPrices(double ibmPrice,double cpePrice,double msft){
        this.ibmPrice=ibmPrice;
        this.cpePrice=cpePrice;
        this.msft=msft;
        notifyObserver();
    }

}
