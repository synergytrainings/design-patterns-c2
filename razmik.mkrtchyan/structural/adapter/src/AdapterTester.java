import main.java.com.synisys.designPatternsTraining.prototype.impl.EnumerationIteratorAdapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Razmik on 6/4/2015.
 */
public class AdapterTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vector<Integer> vector = new Vector<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Enumeration<Integer> enumerator = vector.elements();
        Iterator<Integer> enumToIt = new EnumerationIteratorAdapter<>(enumerator);
        while (enumToIt.hasNext()) {
            System.out.println(enumToIt.next());
        }
    }
}
