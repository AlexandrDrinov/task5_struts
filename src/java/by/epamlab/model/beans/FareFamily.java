package by.epamlab.model.beans;

import java.util.List;

public class FareFamily {

    private String fareFamilyCode;
    private List<AncillaryAirComponent> ancillaryAirComponentList;

    public FareFamily() {
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public List<AncillaryAirComponent> getAncillaryAirComponentList() {
        return ancillaryAirComponentList;
    }

    public void setAncillaryAirComponentList(List<AncillaryAirComponent> ancillaryAirComponentList) {
        this.ancillaryAirComponentList = ancillaryAirComponentList;
    }

    @Override
    public String toString() {
        return "FareFamily{" + "fareFamilyCode=" + fareFamilyCode + ", ancillaryAirComponentList=" + ancillaryAirComponentList + '}';
    }

}
