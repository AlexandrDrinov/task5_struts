package by.epamlab.ifaces;

import by.epamlab.model.beans.User;

public interface IUserDAO {

    User getUser(String login, String password);
}
