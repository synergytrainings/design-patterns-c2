import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/5/15 <br/>
 * <b>Time:</b> 4:11 AM <br/>
 */
public final class ListAdapter {
    private ListAdapter() {}

    public static <T> List<T> MapToList(Map<?, T> source) {
        List<T> retVal = new ArrayList<>();
        for (T item : source.values()) {
            retVal.add(item);
        }
        return retVal;

//        return source.values().stream().collect(Collectors.toList()); // Is not available under JVM <= v.1.7
    }

    public static <T> List<T> SetToList(Set<T> source) {
        List<T> retVal = new ArrayList<>();
        for (T item : source) {
            retVal.add(item);
        }
        return retVal;

//        return source.stream().collect(Collectors.toList()); // Is not available under JVM <= v.1.7
    }
}
