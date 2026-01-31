package it.softwareinside.bff.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import io.quarkus.logging.Log;


public class ContractRequest implements Serializable {
    
    private String contractId;
    private BigDecimal maximumAmount;
    private String transferorCompanyName;
    private boolean valid;
    private List<String> validationErrors = new ArrayList<>();

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }
    public BigDecimal getMaximumAmount() {
        return maximumAmount;
    }
    public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }
    public String getTransferorCompanyName() {
        return transferorCompanyName;
    }
    public void setTransferorCompanyName(String transferorCompanyName) {
        this.transferorCompanyName = transferorCompanyName;
    }

    
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public List<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    @Override
    public String toString() {
        return "ContractRequest [contractId=" + contractId + ", maximumAmount=" + maximumAmount
                + ", transferorCompanyName=" + transferorCompanyName + ", valid=" + valid + "]";
    }

    public void validate() {
        this.validationErrors.clear();
        Log.info("Validating contract request...");
        if(this.maximumAmount == null) {
            validationErrors.add("Maximum amount cannot be null");
        }

        setValid(validationErrors.isEmpty());
    }


}
