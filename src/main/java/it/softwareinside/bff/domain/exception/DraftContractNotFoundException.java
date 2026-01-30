package it.softwareinside.bff.domain.exception;

public class DraftContractNotFoundException extends RuntimeException {

    private String contractId;

    public DraftContractNotFoundException(String contractId) {
        super("Draft contract with id %s was not found".formatted(contractId));
    }

    public String getContractId() {
        return contractId;
    }
}
