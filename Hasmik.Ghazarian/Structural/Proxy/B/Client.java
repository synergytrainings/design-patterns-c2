package com.synisys.de.peru.proxy;

/**
 * Author: Hasmik Ghazaryan on 1/18/2016.
 */
public class Client {
    public static void main(String[] args) {
        CachedLogging logger = new CachedLoggingProxy();
        for (int i = 1; i < 5; i++) {
            logger.logRequest("logString "+i);
        }
    }
}
