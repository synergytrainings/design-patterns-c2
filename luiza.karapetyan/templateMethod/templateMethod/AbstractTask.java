package com.synisys.de.rwandaIngo.templateMethod;

public abstract class AbstractTask implements Task {
    @Override
    public final void execute() {
        validateTask();
        updateTaskState();
        notifyInterestedParties();        
    }
    
    protected abstract void validateTask();
    
    protected abstract void updateTaskState();
    
    protected abstract void notifyInterestedParties();
}
