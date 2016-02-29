package Iterator;

import java.util.ArrayList;

/**
 * Created by Hasmik.Ghazaryan on 2/29/2016.
 */
public class RunPattern {

    public static void main(String [] arguments){

     TodoListCollection lists = null; //Read data from file

     System.out.println("Lists retrieved. Printing out contents using the Iterator");
     System.out.println();
     TodoPrinter.printToDoListCollection(lists);
     }
}
