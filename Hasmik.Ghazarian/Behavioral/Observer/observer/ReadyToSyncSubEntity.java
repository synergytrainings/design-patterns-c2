package observer;

import java.util.Date;

/**
 * Created by Hasmik.Ghazaryan on 3/15/2016.
 */
public class ReadyToSyncSubEntity extends SubEntity {

    private int parentId;
    private Date syncDate;

    public ReadyToSyncSubEntity(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    private void sync(){
        //implementation
    };

    @Override
    public void update(Subject subject) {
        this.parentId = subject.getIdentity();
        this.syncDate = subject.getSyncDate();
        sync();
    }
}
