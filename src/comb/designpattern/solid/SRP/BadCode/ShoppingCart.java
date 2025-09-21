package comb.designpattern.solid.SRP.BadCode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    void calculatePrice(List<Product> products) {
        int totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
        System.out.println("Calculating price: " + totalPrice);
    }

    void saveToDb(){
        System.out.println("saving to database");
    }


}
