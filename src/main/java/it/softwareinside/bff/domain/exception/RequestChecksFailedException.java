package it.softwareinside.bff.domain.exception;

public class RequestChecksFailedException extends RuntimeException {

    public RequestChecksFailedException(String message) {
        super(message);
    }

}
