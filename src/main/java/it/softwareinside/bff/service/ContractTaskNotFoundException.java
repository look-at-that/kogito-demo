package it.softwareinside.bff.service;

public class ContractTaskNotFoundException extends RuntimeException {

    public ContractTaskNotFoundException(String contractId) {
        super("Contract Task with id %s was not found".formatted(contractId));
    }
}
