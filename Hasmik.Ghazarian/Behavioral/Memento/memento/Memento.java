package memento;

/**
 * Created by Hasmik.Ghazaryan on 3/10/2016.
 */
public class Memento<T> {

    private T state;

    public T getState()
    {
        return state;
    }

    public void setState(T state)
    {
        this.state = state;
    }
}
