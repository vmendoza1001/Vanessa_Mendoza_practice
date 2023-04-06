package April_1_Homework;

public class MainHomeworkApril1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Vanessa");

        customer.setEmail("vanessa@gmail.com");

        Product[] products = new Product[10];
        products[0] = new Product("Desk",
                99.0);
        products[1] = new Product("Chair",
                50.0);
        customer.setProducts(products);

        Address[] addresses = new Address[10];
        customer.setAddresses(addresses);

        Address address1 = new Address(true,
                429,
                "Dance Street",
                "Music",
                "NJ");
        customer.addAddress(address1);
        Address address2 = new Address(false,
                160,
                "Step Ave",
                "Sing",
                "NY");
        customer.addAddress(address2);

        String customerInfo = customer.getCustomerInfo();
        System.out.println(customerInfo);
    }
}
