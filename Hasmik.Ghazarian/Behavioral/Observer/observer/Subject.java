package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Hasmik.Ghazaryan on 3/15/2016.
 */
public class Subject {

    private List<SubEntity> sybEntities = new ArrayList<SubEntity>();
    private int identity;
    private Date syncDate;

    public int getIdentity() {
        return identity;
    }

    public Date getSyncDate() {
        return syncDate;
    }

    public void setChanges(int identity, Date syncDate) {
        this.identity = identity;
        this.syncDate = syncDate;
        notifyAllObservers();
    }

    public void addObserver(SubEntity subEntity){
        sybEntities.add(subEntity);
    }

    public void notifyAllObservers(){
        for (SubEntity subEntity : sybEntities) {
            subEntity.update(this);
        }
    }
}
