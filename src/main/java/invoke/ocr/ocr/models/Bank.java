package invoke.ocr.ocr.models;

public class Bank {
    private String Name;
    private String IBAN;
    private String SWIFT;

    public Bank(String name, String IBAN, String SWIFT) {
        this.Name = name;
        this.IBAN = IBAN;
        this.SWIFT = SWIFT;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getSWIFT() {
        return SWIFT;
    }

    public void setSWIFT(String SWIFT) {
        this.SWIFT = SWIFT;
    }
}
