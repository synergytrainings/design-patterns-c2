package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */
public class TodoListImpl implements TodoList {
    private String listName;
    private ArrayList<String> items = new ArrayList();

    public void add(String item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public void add(String item, int position) {
        if (!items.contains(item)) {
            items.add(position, item);
        }
    }

    public void remove(String item) {
        if (items.contains(item)) {
            items.remove(items.indexOf(item));
        }
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public Iterator getIterator() {
        return items.iterator();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String newListName) {
        listName = newListName;
    }

    public String toString() {
        return listName;
    }
}
