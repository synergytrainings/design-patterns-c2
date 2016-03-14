/**
 * Created by davit.harutyunyan on 3/14/2016.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}
