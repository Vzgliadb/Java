package Orders;

import Adress.Address;
import Products.Product;

import java.util.List;


public class Order {
    public static int id;
    public List<Product> productList;
    public Address address;

    public Order(List<Product> products) {
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                "address=" + address +
                '}';
    }

    public Order(List<Product> productList, Address address) {
        id++;
        this.productList = productList;
        this.address = address;
    }

}