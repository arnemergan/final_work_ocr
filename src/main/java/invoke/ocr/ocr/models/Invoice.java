package invoke.ocr.ocr.models;

import java.util.Date;

public class Invoice {
    private String Number;
    private Date PaymentDate;
    private Date InvoiceDate;
    private Double TotalPriceExlVat;
    private Double VAT;
    private Double TotalPriceInclVat;
    private String Currency;
    private Bank BankInformation;

    public Invoice(String number, Date paymentDate, Date invoiceDate, Double totalPriceExlVat, Double VAT, Double totalPriceInclVat, String currency, Bank bankInformation) {
        Number = number;
        PaymentDate = paymentDate;
        InvoiceDate = invoiceDate;
        TotalPriceExlVat = totalPriceExlVat;
        this.VAT = VAT;
        TotalPriceInclVat = totalPriceInclVat;
        Currency = currency;
        BankInformation = bankInformation;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        PaymentDate = paymentDate;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    public Double getTotalPriceExlVat() {
        return TotalPriceExlVat;
    }

    public void setTotalPriceExlVat(Double totalPriceExlVat) {
        TotalPriceExlVat = totalPriceExlVat;
    }

    public Double getVAT() {
        return VAT;
    }

    public void setVAT(Double VAT) {
        this.VAT = VAT;
    }

    public Double getTotalPriceInclVat() {
        return TotalPriceInclVat;
    }

    public void setTotalPriceInclVat(Double totalPriceInclVat) {
        TotalPriceInclVat = totalPriceInclVat;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Bank getBankInformation() {
        return BankInformation;
    }

    public void setBankInformation(Bank bankInformation) {
        BankInformation = bankInformation;
    }
}
