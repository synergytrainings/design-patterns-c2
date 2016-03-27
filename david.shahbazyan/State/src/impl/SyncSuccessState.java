package impl;

import api.SyncState;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 28, 2016
 */
class SyncSuccessState implements SyncState {
    @Override
    public SyncState doAction() {
        //TODO: Show notification about synchronization completion.
        return null;
    }
}
