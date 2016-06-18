package by.epamlab.tags;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.AbstractTag;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.Reservation;
import by.epamlab.model.factories.DataFactory;

public class ReservationTag extends AbstractTag {

    @Override
    public void doTag() {

        try {
            IDataDAO data = DataFactory.getClassFromFactory();
            Reservation reservation = data.getReservation(getFullPath());
            getJspContext().setAttribute("reservation", reservation);            
        } catch (DAOException ex) {            
            getJspContext().setAttribute("reservation", null);
        }
    }
}
