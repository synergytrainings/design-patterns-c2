package memento;

/**
 * Created by Hasmik.Ghazaryan on 3/10/2016.
 */
public class Originator<T> {

    private T state;

    //for saving the state
    public Memento<T> createMemento()
    {
        Memento<T> m = new Memento<T>();
        m.setState(state);
        return m;
    }

    //for restoring the state
    public void setMemento(Memento<T> m)
    {
        state = m.getState();
    }

    //change the state of the Originator
    public void setState(T state)
    {
        this.state = state;
    }

    //show the state of the Originator
    public void showState()
    {
        System.out.print(state.toString());
    }
}
