package it.softwareinside.bff.domain.exception;

public class ContractRequestNotFoundException extends RuntimeException {

    public ContractRequestNotFoundException(String contractId) {
        super("Contract request with id %id was not found".formatted(contractId));
    }

}
