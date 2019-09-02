package com.company;

public class Main {

    public static void main(String[] args) {

        // set context
        DiscountContext context = new DiscountContext();

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
        GetDiscountSimpleFactory factory = new GetDiscountSimpleFactory();

        DiscountCalculator discountCalculator = factory.getDiscountCalculator();

        double totalDiscount = discountCalculator.getDiscount(shoppingCart);

        System.out.println(totalDiscount);
    }
}
