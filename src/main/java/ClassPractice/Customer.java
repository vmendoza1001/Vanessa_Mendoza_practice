package ClassPractice;

public class Customer {

    protected String customerName;
    protected String address;
    protected String email;
    protected String purchasedProduct;

}

class CustomerInfo extends Customer {
    //constructor created
    public CustomerInfo() {

    }

    //constructor created (overloaded constructor)
    public CustomerInfo(String customerName, String address, String email, String purchasedProduct) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProduct = purchasedProduct;

    }

    public String getCustomerName() {

        return customerName;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public String getAddress() {

        return address;
    }

    public String getEmail() {

        return email;
    }

}


