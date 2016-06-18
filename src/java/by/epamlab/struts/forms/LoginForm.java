package by.epamlab.struts.forms;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm {
    
    private String userLogin;
    private String userPassword;
    
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
