package by.epamlab.model.beans;

public class Payment {

    private Double amountPaid;
    private String formOfPaymentTypeCode;
    private String currencyCode;

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getFormOfPaymentTypeCode() {
        return formOfPaymentTypeCode;
    }

    public void setFormOfPaymentTypeCode(String formOfPaymentTypeCode) {
        this.formOfPaymentTypeCode = formOfPaymentTypeCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "Payment{" + "amountPaid=" + amountPaid + ", formOfPaymentTypeCode=" + formOfPaymentTypeCode + ", currencyCode=" + currencyCode + '}';
    }

}
