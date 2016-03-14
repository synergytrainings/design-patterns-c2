/**
 * Created by davit.harutyunyan on 3/14/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver firstObserver = new StockObserver(stockGrabber);
        stockGrabber.setPrices(150,400,300);
        stockGrabber.setPrices(180,480,305);
        stockGrabber.setPrices(190,485,310);
        StockObserver secondObserver = new StockObserver(stockGrabber);

        stockGrabber.setPrices(170,400,300);
        stockGrabber.setPrices(160,470,305);
        stockGrabber.setPrices(150,485,800);
    }
}
