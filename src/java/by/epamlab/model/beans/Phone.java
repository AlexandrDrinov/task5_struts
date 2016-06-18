package by.epamlab.model.beans;

public class Phone {

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneNumber=" + phoneNumber + '}';
    }

}
