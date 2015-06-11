package java.com.synisys;

/**
 * Created by Emil on 6/12/2015.
 */
public interface Persistence {

    int persist(Object object);

    Object findById(int objectId);

    void deleteById(int id);

}
