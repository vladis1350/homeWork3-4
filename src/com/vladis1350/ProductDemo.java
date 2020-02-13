package com.vladis1350;

import com.vladis1350.bean.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple");
        apple.setRegularPrice(1.6);
        apple.setDiscount(5);
        apple.printInformation();

        Product cheese = new Product("Cheese");
        cheese.setRegularPrice(2.2);
        cheese.setDiscount(17);
        cheese.printInformation();
    }
}
