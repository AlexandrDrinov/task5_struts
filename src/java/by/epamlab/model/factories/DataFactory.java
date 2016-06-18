package by.epamlab.model.factories;

import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.impl.XmlToData;

public class DataFactory {
	public static IDataDAO getClassFromFactory() {
		return new XmlToData ();
	}
}
