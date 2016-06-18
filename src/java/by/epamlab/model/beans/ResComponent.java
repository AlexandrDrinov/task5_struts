package by.epamlab.model.beans;

import java.util.Date;

public class ResComponent {

    private String componentTypeCode;
    private Date createDateTime;
    private String internalStatus;
    private int sequence;

    public String getComponentTypeCode() {
        return componentTypeCode;
    }

    public void setComponentTypeCode(String componentTypeCode) {
        this.componentTypeCode = componentTypeCode;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getInternalStatus() {
        return internalStatus;
    }

    public void setInternalStatus(String internalStatus) {
        this.internalStatus = internalStatus;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "ResComponent{" + "componentTypeCode=" + componentTypeCode + ", createDateTime=" + createDateTime + ", internalStatus=" + internalStatus + ", sequence=" + sequence + '}';
    }

}
