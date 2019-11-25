package invoke.ocr.ocr.models;

import java.util.List;

public class InvoiceResponse {
    private Invoice invoice;
    private Vendor vendor;
    private Customer customer;
    private List<Product> products;

    public InvoiceResponse(Invoice invoice, Vendor vendor, Customer customer, List<Product> products) {
        this.invoice = invoice;
        this.vendor = vendor;
        this.customer = customer;
        this.products = products;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
