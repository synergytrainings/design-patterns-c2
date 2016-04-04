package visitor.domain;


import visitor.domain.visitor.Bus;
import visitor.domain.visitor.Ship;
import visitor.domain.visitor.Taxi;

public interface Dispatcher {
    public void order(Taxi taxi);
    public void order(Bus bus);
    public void order(Ship ship);
}
