package Iterator;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */
public interface TodoListCollection extends Iterate{
    void add(TodoList list);
    void remove(TodoList list);
    int getNumberOfItems();
}
