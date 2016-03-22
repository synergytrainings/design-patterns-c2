package observer.domain;


import java.util.ArrayList;

public class Auctioneer implements Subject{

    private ArrayList<Observer> observers;
    private float bidPrice;

    public Auctioneer() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Registered: " + o.toString());
    }


    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
        System.out.println("Unregistered: " + o.toString());
    }

    // Notify state changes
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(bidPrice);
        }
    }

    private void bidPriceChanged() {
        notifyObservers();
    }

    public void setBidPrice(float bidPrice) {
        this.bidPrice = bidPrice;
        bidPriceChanged();
    }

    public float getBidPrice() {
        return bidPrice;
    }

}
