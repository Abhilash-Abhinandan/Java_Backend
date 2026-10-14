package com.abhilash.app;

import com.abhilash.model.ProductInfo;
import com.abhilash.service.ShoppingCart;

public class Driver {

    public static void main(String[] args) {

        ProductInfo[] products = {
            new ProductInfo("Laptop",    55000.00, 1),
            new ProductInfo("Mouse",       800.00, 2),
            new ProductInfo("Keyboard",   1500.00, 1),
            new ProductInfo("Monitor",   12000.00, 1),
            new ProductInfo("USB Cable",   250.00, 3)
        };

        ShoppingCart cart = new ShoppingCart(products);
        cart.printReceipt();
    }
}