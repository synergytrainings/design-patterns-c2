package observer;

import java.util.Date;

/**
 * Created by Hasmik.Ghazaryan on 3/15/2016.
 */
public abstract class SubEntity {

    //Observer
    protected Subject subject;
    public abstract void update(Subject subject);

}
