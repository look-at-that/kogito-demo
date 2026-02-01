package it.softwareinside.bff.domain.exception;

import java.util.List;

public class RequestChecksFailedException extends RuntimeException {

    private List<String> errors;

    public RequestChecksFailedException(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

}
