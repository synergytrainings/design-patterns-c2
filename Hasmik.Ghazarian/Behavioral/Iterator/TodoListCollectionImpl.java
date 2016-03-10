package Iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */
public class TodoListCollectionImpl implements TodoListCollection{

    private HashMap<String, TodoList> lists = new HashMap();

    public void add(TodoList list) {
        if (!lists.containsKey(list.getListName())) {
            lists.put(list.getListName(), list);
        }
    }

    public void remove(TodoList list) {
        if (lists.containsKey(list.getListName())) {
            lists.remove(list.getListName());
        }
    }

    public int getNumberOfItems() {
        return lists.size();
    }

    public Iterator getIterator() {
        return lists.values().iterator();
    }

    public String toString() {
        return getClass().toString();
    }
}

