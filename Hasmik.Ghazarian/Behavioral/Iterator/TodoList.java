package Iterator;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */
public interface TodoList extends Iterate{
    void add(String item);
    void add(String item, int position);
    void remove(String item);
    int getNumberOfItems();
    String getListName();
    void setListName(String newListName);
}
