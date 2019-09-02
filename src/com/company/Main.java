package com.company;

public class Main {

    public static void main(String[] args) {

        // set context
        boolean isRegularCustomer = true;
        boolean isXmas = true;
        boolean isGrazyMonday = true;

        // set inventory
        Product soap = new Product("Soap", 1.99);
        Product towel = new Product("Green towel", 10.98);
        Product grapes = new BunchOfGrapes("blue");

        // Start shopping
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.accept(soap);
        shoppingCart.accept(towel);
        shoppingCart.accept(grapes);

        // calculate discount
        // ensure that the customer will profit form the
        // most discount.
        if (isRegularCustomer) {

            // ehm...
            // Business rules:
            // 1. Vaste klanten krijgen altijd 50% korting op alle artikelen.
            // 2. Op kerstavond krijgt iedereen 25% korting op het eerste en 12.5% korting op alle andere artikelen.
            // 3. Op grazy-monday krijg je evenveel korting als het aantal artikelen dat je bestelt.
        }


    }
}
