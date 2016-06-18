package by.epamlab.model.beans;

import java.util.List;

public class Customer {

    private String customerDocID;
    private String firstName;
    private String lastName;
    private int sequence;
    private Email email;
    private Phone phone;
    private List<Payment> paymentsList;

    public String getCustomerDocID() {
        return customerDocID;
    }

    public void setCustomerDocID(String customerDocID) {
        this.customerDocID = customerDocID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Payment> getPaymentsList() {
        return paymentsList;
    }

    public void setPaymentsList(List<Payment> paymentsList) {
        this.paymentsList = paymentsList;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerDocID=" + customerDocID + ", firstName=" + firstName + ", lastName=" + lastName + ", sequence=" + sequence + ", email=" + email + ", phone=" + phone + ", paymentsList=" + paymentsList + '}';
    }

}
