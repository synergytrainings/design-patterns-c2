package observer;


import observer.domain.Auctioneer;
import observer.domain.Bidder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        Bidder b1 = new Bidder("Bidder One - Kat");
        Bidder b2 = new Bidder("Bidder Two - Ash");
        Bidder b3 = new Bidder("Bidder Three - Jade");

        // Register bidders
        System.out.println("------ Registering all bidders");
        auctioneer.registerObserver(b1);
        auctioneer.registerObserver(b2);
        auctioneer.registerObserver(b3);

        // Auctioneer to broadcast bid price
        System.out.println("------ Enter 'C' to close the bid.");
        Scanner scan = new Scanner(System.in);
        boolean isBidClosed = false;
        do {
            if (auctioneer.getBidPrice() <= 0)
                System.out.print("Enter a starting bid price: ");
            else
                System.out.print("Enter a new highest bid price: ");

            try {
                auctioneer.setBidPrice(scan.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("------ This bid is CLOSED now.");
                isBidClosed = true;
                scan.close();
            }
        } while (isBidClosed == false);

        // Unregister bidders
        System.out.println("------ Unregistering all bidders");
        auctioneer.removeObserver(b1);
        auctioneer.removeObserver(b2);
        auctioneer.removeObserver(b3);
    }
}
