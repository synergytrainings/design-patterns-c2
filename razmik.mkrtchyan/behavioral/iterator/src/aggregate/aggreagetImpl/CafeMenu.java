package aggregate.aggreagetImpl;

import aggregate.aggregateApi.Menu;
import model.api.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public class CafeMenu implements Menu {
    private Map<String, MenuItem> itemMap;

    public CafeMenu() {
        itemMap = new HashMap<>();
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return itemMap.values().iterator();
    }

    @Override
    public void addItem(MenuItem menuItem) {
        itemMap.put(menuItem.getName(), menuItem);
    }
}
