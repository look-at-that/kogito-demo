package it.softwareinside.bff.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class DraftContract implements Serializable {

    private String id;
    private String customerName;

    public DraftContract(String id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "ContactTask{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public boolean isValid() {
        return StringUtils.isNotEmpty(customerName) &&
                StringUtils.isNotEmpty(id);
    }
}
