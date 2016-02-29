package flyweight;

import java.util.HashMap;


public class BagFactory {
    private static final HashMap<Integer, Bag> bagsMap = new HashMap<Integer, Bag>();

    public static Bag getSuitcase(Integer weight){
        Suitcase bag = (Suitcase)bagsMap.get(weight);

        if(bag == null){
            bag = new Suitcase(weight);
            bagsMap.put(weight,bag);
        }
        return bag;
    }
}
