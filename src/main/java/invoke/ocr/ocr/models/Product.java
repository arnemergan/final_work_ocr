package invoke.ocr.ocr.models;

public class Product {
    private String Id;
    private String Name;
    private Double UnitPrice;
    private Integer Quantity;
    private Double Discount;
    private Double Vat;
    private Double TotalPrice;

    public Product(String id, String name, Double unitPrice, Integer quantity, Double discount, Double vat, Double totalPrice) {
        Id = id;
        Name = name;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
        Vat = vat;
        TotalPrice = totalPrice;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public Double getVat() {
        return Vat;
    }

    public void setVat(Double vat) {
        Vat = vat;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }
}
