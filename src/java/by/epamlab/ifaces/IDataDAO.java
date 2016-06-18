package by.epamlab.ifaces;

import by.epamlab.exception.DAOException;
import java.util.List;

import by.epamlab.model.beans.Customer;
import by.epamlab.model.beans.FareFamily;
import by.epamlab.model.beans.ResComponent;
import by.epamlab.model.beans.Reservation;

public interface IDataDAO {

    Reservation getReservation(String filePath) throws DAOException;

    List<ResComponent> getResComponents(String filePath) throws DAOException;

    FareFamily getFareFamily(String filePath) throws DAOException;

    Customer getCustomer(String filePath) throws DAOException;
}
