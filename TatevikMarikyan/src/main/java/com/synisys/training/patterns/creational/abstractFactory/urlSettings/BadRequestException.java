package com.synisys.training.patterns.creational.abstractFactory.urlSettings;

/**
 * @author vahe.marikyan
 * @since 4/29/2015.
 */
public class BadRequestException extends Exception {
    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = -7807262554973482264L;

    private int statusCode;

    /**
     * constructor initialize properties by given parameters
     *
     * @param message - String
     * @param statusCode - int
     */
    public BadRequestException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
