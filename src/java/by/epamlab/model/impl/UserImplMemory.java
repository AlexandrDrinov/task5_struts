package by.epamlab.model.impl;

import java.util.HashMap;
import java.util.Map;

import by.epamlab.ifaces.IUserDAO;
import by.epamlab.model.beans.User;

public class UserImplMemory implements IUserDAO {

    private static final Map<String, User> USERS = new HashMap<String, User>();

    static {
        User user = new User("user", "user");
        USERS.put(user.getLogin(), user);

    }

    public User getUser(String login, String password) {
        User user = null;
        if (USERS.containsKey(login) && USERS.get(login).checkPassword(password)) {
            user = USERS.get(login);
        }
        return user;
    }
}
