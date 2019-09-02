package com.company;

public class Main {

    public static void main(String[] args) {

        // set inventory
        Product soap = new Product("Soap", 1.99);
        Product towel = new Product("Green towel", 10.98);
        Product grapes = new BunchOfGrapes("blue");

        // Start shopping
        ShoppingCart shoppingCart = new ShoppingCart();

    }
}
