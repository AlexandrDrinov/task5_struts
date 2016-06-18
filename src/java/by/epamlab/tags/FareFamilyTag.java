package by.epamlab.tags;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.AbstractTag;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.FareFamily;
import by.epamlab.model.factories.DataFactory;

public class FareFamilyTag extends AbstractTag {

    @Override
    public void doTag() {
        try {
            IDataDAO data = DataFactory.getClassFromFactory();
            FareFamily fareFamily = data.getFareFamily(getFullPath());
            getJspContext().setAttribute("fareFamily", fareFamily);
        } catch (DAOException ex) {
            getJspContext().setAttribute("fareFamily", null);
        }
    }
}
