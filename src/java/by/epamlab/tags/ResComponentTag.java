package by.epamlab.tags;

import by.epamlab.exception.DAOException;
import java.util.List;

import by.epamlab.ifaces.AbstractTag;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.ResComponent;
import by.epamlab.model.factories.DataFactory;

public class ResComponentTag extends AbstractTag {

    @Override
    public void doTag() {

        try {
            IDataDAO data = DataFactory.getClassFromFactory();
            List<ResComponent> resComponents = data.getResComponents(getFullPath());
            getJspContext().setAttribute("resComponents", resComponents);
        } catch (DAOException ex) {
            getJspContext().setAttribute("resComponents", null);
        }
    }
}
