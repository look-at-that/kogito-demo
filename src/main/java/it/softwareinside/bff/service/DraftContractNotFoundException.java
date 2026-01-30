package it.softwareinside.bff.service;

public class DraftContractNotFoundException extends RuntimeException {

    public DraftContractNotFoundException(String contractId) {
        super("Draft contract with id %s was not found".formatted(contractId));
    }
}
