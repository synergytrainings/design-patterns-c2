package java.com.synisys;

/**
 * Created by Emil on 6/12/2015.
 */
public class PersistenceImp implements Persistence {

    private PersistenceImplementor implementor = null;

    public PersistenceImp(PersistenceImplementor imp) {

        this.implementor = imp;

    }

    @Override
    public void deleteById(int id) {

        implementor.deleteObject(id);

    }

    @Override
    public Object findById(int objectId) {

        return implementor.getObject(objectId);
    }



    @Override
    public int persist(Object object) {

        return implementor.saveObject(object);


    }
}
