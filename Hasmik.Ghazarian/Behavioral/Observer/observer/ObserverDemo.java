package observer;

/**
 * Created by Hasmik.Ghazaryan on 3/15/2016.
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        SyncService service = new SyncService();

        SubEntity readySubEntity = new ReadyToSyncSubEntity(subject);
        SubEntity notReadySubEntity = new NotReadySubEntity(subject);

        subject.setChanges(service.getSyncData().getIdentity(), service.getSyncData().getSyncDate());

    }
}
