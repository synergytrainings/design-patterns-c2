package com.synisys.de.peru.proxy;

/**
 * Author: Hasmik Ghazaryan on 1/18/2016.
 */
public class CachedLoggingImpl implements CachedLogging {
    public void logRequest(String logString) {
        System.out.println("CachedLogger logging to some expensive resource: " + logString + "\n");
    }
}
