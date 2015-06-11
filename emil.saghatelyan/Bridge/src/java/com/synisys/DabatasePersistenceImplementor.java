package java.com.synisys;

/**
 * Created by Emil on 6/12/2015.
 */
public class DabatasePersistenceImplementor implements PersistenceImplementor {

    public DabatasePersistenceImplementor() {

        // init Db driver
    }

    @Override
    public void deleteObject(int objectId) {
        System.out.print("remove item from DB");
        // open database connection
        // remove record

    }

    @Override
    public Object getObject(int objectId) {
        System.out.print("return item from DB");
        return null;
    }

    @Override
    public int saveObject(Object object) {

        System.out.print("save item to DB");

        return 0;
    }
}
