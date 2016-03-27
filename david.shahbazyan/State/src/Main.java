import api.SyncState;
import impl.NewSyncState;
import impl.SyncFailedState;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public class Main {
    public static void main(String[] args) {
        SyncState currentSyncState = new NewSyncState();
        int failsCount = 0;
        System.out.println("Sync started.");
        do {
            System.out.println(">> " + currentSyncState + " -> doAction()");
            currentSyncState = currentSyncState.doAction();
            System.out.println("<< " + currentSyncState);
            if (currentSyncState instanceof SyncFailedState) {
                failsCount++;
            }
        } while (currentSyncState != null && failsCount < 5);
        System.out.println("Sync finished.");
    }
}
