package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String contact;
    private String license;
    private String nicCard;

    public Customer() {
    }

    public Customer(String customerID, String customerName, String customerAddress, String contact, String license, String nicCard) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contact = contact;
        this.license = license;
        this.nicCard = nicCard;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNicCard() {
        return nicCard;
    }

    public void setNicCard(String nicCard) {
        this.nicCard = nicCard;
    }

    /*@Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", contact='" + contact + '\'' +
                ", license='" + license + '\'' +
                ", nicCard='" + nicCard + '\'' +
                '}';
    }*/
}
