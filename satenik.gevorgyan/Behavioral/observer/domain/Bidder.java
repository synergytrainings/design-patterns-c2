package observer.domain;


public class Bidder implements Observer {
    private String userName;

    public Bidder(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(float price) {
        // Bidder to propose new bid price in the auction
        float newPriceForBidding = Math.round(price + (Math.random() * 100) + (Math.random() * 100));
        display(newPriceForBidding);
    }

    public void display(float proposedNewBid) {
        System.out.println("Bid of " + this.toString() + " - " + proposedNewBid);
    }

    @Override
    public String toString() {
        return userName;
    }
}
