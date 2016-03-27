package impl;

import api.SyncState;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 28, 2016
 */
public class SyncFailedState implements SyncState {
    @Override
    public SyncState doAction() {
        //TODO: Alert about synchronization fail.
        //TODO: Sleep thread 5 min.
        return new SyncProcessingState();
    }
}
