package memento;


public class Memento {
    private WFState state;

    public Memento(WFState state){
        this.state = state;
    }

    public WFState getState(){
        return state;
    }
}
