package java.com.synisys;

import java.io.File;

/**
 * Created by Emil on 6/12/2015.
 */
public class FileSystemPersistenceImplementor implements PersistenceImplementor {

    @Override
    public void deleteObject(int objectId) {

        System.out.print("delete object from file ");

        return;
    }

    @Override
    public Object getObject(int objectId) {
        System.out.print("Get file from system and return it");
        return null;


    }

    private Object readObjectFromFile(File f) {

        System.out.print("read object from file");
        return null;
    }

    @Override
    public int saveObject(Object object) {
        System.out.print("write object to file");

        return 0;

    }

}
