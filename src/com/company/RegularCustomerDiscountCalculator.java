package com.company;

public class RegularCustomerDiscountCalculator extends DiscountCalculator {

    // 1. Vaste klanten krijgen altijd 50% korting op alle artikelen.
    @Override
    public double getDiscount(ShoppingCart cart) {

        return 0;
    }
}
