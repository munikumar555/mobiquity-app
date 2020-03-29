package com.mobiquity.exception;

/**
 * Exception class that serves for business exception cases.
 */
public class APIException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public APIException(String message) {
        super("API exception: " + message);
    }
}
