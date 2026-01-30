package it.softwareinside.bff.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ContractRequest implements Serializable {
    
    private String contractId;
    private BigDecimal maximumAmount;
    private String transferorCompanyName;

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

    @Override
    public String toString() {
        return "ContractRequest [contractId=" + contractId + ", maximumAmount=" + maximumAmount
                + ", transferorCompanyName=" + transferorCompanyName + "]";
    }
    
}
