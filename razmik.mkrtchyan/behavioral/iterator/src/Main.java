import aggregate.aggreagetImpl.CafeMenu;
import aggregate.aggreagetImpl.DinnerMenu;
import client.Waitress;
import model.impl.MenuItemImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CafeMenu cafeMenu = new CafeMenu();
        cafeMenu.addItem(new MenuItemImpl("cafe", "cafe", 1));
        DinnerMenu dinnerMenu = new DinnerMenu();
        cafeMenu.addItem(new MenuItemImpl("dinner", "dinner", 2));
        Waitress waitress = new Waitress(Arrays.asList(cafeMenu, dinnerMenu));
        waitress.printMenu();
    }
}
