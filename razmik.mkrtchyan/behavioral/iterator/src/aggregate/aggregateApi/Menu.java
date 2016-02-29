package aggregate.aggregateApi;

import model.api.MenuItem;

import java.util.Iterator;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public interface Menu {

    Iterator<MenuItem> createIterator();

    void addItem(MenuItem menuItem);
}
