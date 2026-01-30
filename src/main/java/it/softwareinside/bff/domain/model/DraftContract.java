package it.softwareinside.bff.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class DraftContract implements Serializable {

    public enum Status {
        FOR_APPROVAL,
        APPROVED,
        NOT_APPROVED
    }

    private String contractId;

    private BigDecimal maximumAmount;

    private String transferorCompanyName;

    private Status status;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTransferorCompanyName() {
        return transferorCompanyName;
    }

    public void setTransferorCompanyName(String transferorCompanyName) {
        this.transferorCompanyName = transferorCompanyName;
    }

    
}
