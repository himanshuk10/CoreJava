package comb.designpattern.solid.SRP.BadCode;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(200, "Charger"));
        products.add(new Product(300, "wire"));

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.calculatePrice(products);
        shoppingCart.saveToDb();
    }
}
