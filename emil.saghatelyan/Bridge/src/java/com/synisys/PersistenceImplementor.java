package java.com.synisys;

/**
 * Created by Emil on 6/12/2015.
 */
public interface PersistenceImplementor {

    int saveObject(Object object);

    void deleteObject(int objectId);

    Object getObject(int objectId);
}
