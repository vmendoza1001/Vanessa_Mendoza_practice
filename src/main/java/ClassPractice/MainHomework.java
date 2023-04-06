package ClassPractice;

/*Create “Product” class with the following fields - choose appropriate data types - and appropriate methods
productName
price
Create “Customer” class with the following fields - choose appropriate data types - and appropriate methods
customerName
address
email
Product[] purchasedProducts
Add “getCustomerInfo” method to the Customer class, which displays detailed customer information along with the products s/he purchased
Create “MainHomework” class, in which you do the following in the “main” method
Create 2 Product instances using test productName such as “TV” or “Laptop” with test prices
Create a Customer object instance with test customerName, address, email, and the two products created above
Invoke “getCustomerInfo” method of the Customer object instance
[Daily Homework #2: March 31st, Friday]
*/
public class MainHomework {
    public static void main(String [] args) {


        Product productOne = new Product ("Table ", 280);
        Product productTwo = new Product ("Chair ", 90);
        String[] customerInfo = {"Vanessa", "429 83rd Street", "vanessa@gmail.com", "Table"};
                for (String name : customerInfo ) {
                    System.out.println(name);
                }


        //String purchasedProduct = String.valueOf(productOne);
        //Object customerInfo = (customer + purchasedProduct);
        //Customer purchasedProduct = new PurchasedProduct("Table");


        //System.out.println(customer.getCustomerName());
        //System.out.println(customer.getAddress());
        //System.out.println(customer.getEmail());
        //System.out.println(productOne.getProductName() + "$" + productOne.getPrice());
        //System.out.println(customerInfo.getCustomerInfo());
       // System.out.println(customerInfo.toString());


    }



}

