package by.epamlab.model.beans;

public class User {

    private final int id;
    private final String login;
    private String password;
    private static int setId = 0;

    public User(String login) {
        this.id = setId++;
        this.login = login;        
    }

    public User(String login, String password) {
        this(login);
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserType{" + "id=" + id + ", login=" + login + '}';
    }

}
