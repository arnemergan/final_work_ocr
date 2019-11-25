package invoke.ocr.ocr.models;

public class Vendor {
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private String Website;
    private String VATNumber;

    public Vendor(String name, String address, String phoneNumber, String email, String website, String VATNumber) {
        Name = name;
        Address = address;
        PhoneNumber = phoneNumber;
        Email = email;
        Website = website;
        this.VATNumber = VATNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getVATNumber() {
        return VATNumber;
    }

    public void setVATNumber(String VATNumber) {
        this.VATNumber = VATNumber;
    }
}
