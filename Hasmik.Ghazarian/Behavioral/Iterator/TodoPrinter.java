package Iterator;

import java.util.Iterator;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */

public class TodoPrinter {

    public static void printToDoList(TodoList list) {
        Iterator elements = list.getIterator();
        System.out.println(" List - " + list + ":");
        while (elements.hasNext()) {
            System.out.println("\t" + elements.next());
        }
    }

    public static void printToDoListCollection(TodoListCollection lotsOfLists) {
        Iterator elements = lotsOfLists.getIterator();
        System.out.println("\"To Do\" List Collection:");
        while (elements.hasNext()) {
            printToDoList((TodoList) elements.next());
        }
    }

    public static void printIteratingElement(Iterate element) {
        System.out.println("Printing the element " + element);
        Iterator elements = element.getIterator();
        while (elements.hasNext()) {
            Object currentElement = elements.next();
            if (currentElement instanceof Iterate) {
                printIteratingElement((Iterate) currentElement);
                System.out.println();
            } else {
                System.out.println(currentElement);
            }
        }
    }
}

