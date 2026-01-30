package it.softwareinside.bff.model;

public class ContractTask {

    private String id;
    private String customerName;

    public ContractTask(String id, String customerName) {
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
}
