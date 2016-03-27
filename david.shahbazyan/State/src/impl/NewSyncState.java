package impl;

import api.SyncState;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 28, 2016
 */
public class NewSyncState implements SyncState {
    @Override
    public SyncState doAction() {
        //TODO: Init the files list in local directory.
        //TODO: Prepare files for synchronization.
        return new SyncProcessingState();
    }
}
