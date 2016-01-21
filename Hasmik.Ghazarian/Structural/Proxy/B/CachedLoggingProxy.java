package com.synisys.de.peru.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Hasmik Ghazaryan on 1/18/2016.
 */
public class CachedLoggingProxy implements CachedLogging {
    List<String> cachedLogEntries = new ArrayList<String>();
    CachedLoggingImpl cachedLogger = new CachedLoggingImpl();
    public void logRequest(String logString) {
        addLogRequest(logString);
    }
    private void addLogRequest(String logString) {
        cachedLogEntries.add(logString);
        if(cachedLogEntries.size() >= 4)
            performLogging();
    }
    private void performLogging() {
        StringBuffer accumulatedLogString = new StringBuffer();
        for (String logString : cachedLogEntries) {
            accumulatedLogString.append("\n"+logString);
            System.out.println("CachedLoggingProxy: adding logString \"" +logString + "\" to cached log entries.");
        }
        System.out.println("CachedLoggingProxy: sends accumulated logstring to CachedLogger.");
                cachedLogger.logRequest(accumulatedLogString.toString());
        cachedLogEntries.clear();
        System.out.println("CachedLoggingProxy: cachedLogEntries cleared.");
    }
}
