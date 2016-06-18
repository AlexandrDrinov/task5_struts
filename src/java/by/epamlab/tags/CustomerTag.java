package by.epamlab.tags;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.AbstractTag;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.Customer;
import by.epamlab.model.factories.DataFactory;

public class CustomerTag extends AbstractTag {

    @Override
    public void doTag() {
        try {
            IDataDAO data = DataFactory.getClassFromFactory();
            Customer customer = data.getCustomer(getFullPath());
            getJspContext().setAttribute("customer", customer);
        } catch (DAOException ex) {
            getJspContext().setAttribute("customer", null);
        }
    }
}
