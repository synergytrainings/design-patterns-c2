package visitor;


import visitor.domain.Dispatcher;
import visitor.domain.DispatcherIml;
import visitor.domain.visitor.Bus;
import visitor.domain.visitor.Ship;
import visitor.domain.visitor.Taxi;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        Taxi taxi = new Taxi("96TY1548");
        taxi.setOrderKm(50);
        Bus bus1 = new Bus("45OO4587",40, false);
        bus1.setOrderDays(2);
        bus1.setOrderSeatCount(50);
        Bus bus2 = new Bus("45OO4511",30, true);
        bus2.setOrderDays(1);
        bus2.setOrderSeatCount(10);
        Ship ship = new Ship(4578985,"Washington");

        Dispatcher dispatcher = new DispatcherIml();
        dispatcher.order(taxi);
        System.out.println("******************************");
        dispatcher.order(bus1);
        System.out.println("******************************");
        dispatcher.order(bus2);
        System.out.println("******************************");
        dispatcher.order(ship);
    }
}
