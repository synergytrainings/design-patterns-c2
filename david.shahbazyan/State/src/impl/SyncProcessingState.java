package impl;

import api.SyncState;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 28, 2016
 */
class SyncProcessingState implements SyncState {
    @Override
    public SyncState doAction() {
        //TODO: Check for proper connection to destination server.
        return isSyncSuccess() ? new SyncSuccessState() : new SyncFailedState();
    }

    private boolean isSyncSuccess() {
        //TODO: Start the synchronization process and return the result.
        return false;
    }
}
