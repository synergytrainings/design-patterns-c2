package client;

import aggregate.aggregateApi.Menu;
import model.api.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public class Waitress {
    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("Name: " + menuItem.getName() + "Description: " + menuItem.getDescription() + "Price: " + menuItem.getPrice());
        }
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }
}
