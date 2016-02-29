package aggregate.aggreagetImpl;

import aggregate.aggregateApi.Menu;
import iterator.DinnerMenuIterator;
import model.api.MenuItem;

import java.util.Arrays;
import java.util.Iterator;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public class DinnerMenu implements Menu {
    private MenuItem[] menuItems;
    int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    public DinnerMenu() {
        this.menuItems = new MenuItem[10];
    }

    @Override
    public void addItem(MenuItem menuItem) {
        if (this.size == menuItems.length) {
            menuItems = Arrays.copyOf(menuItems, this.size * 2);
        }
        menuItems[size++] = menuItem;
    }
}
