package by.epamlab.model.beans;

public class Email {

    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Email{" + "emailAddress=" + emailAddress + '}';
    }

}
