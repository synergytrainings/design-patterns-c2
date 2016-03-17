package observer;

import java.util.Date;

/**
 * Created by Hasmik.Ghazaryan on 3/15/2016.
 */
public class NotReadySubEntity extends SubEntity {

    private int parentId;

    public NotReadySubEntity(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Subject subject) {
        this.parentId = subject.getIdentity();
    }
}
