package com.company;

public class XmasDiscountCalculator extends DiscountCalculator {

    private boolean _isFirstTime = true;

    private double _firstTimeDiscount = .25;
    private double _otherDiscount = .125;

    // 2. Op kerstavond krijgt iedereen 25% korting
    // op het eerste en 12.5% korting op alle andere artikelen.
    @Override
    public double getDiscount(ShoppingCart cart) {

        double totalDiscount = 0;

        for(Product product : cart.getAllProducts()) {

            if(_isFirstTime) {
                totalDiscount += product.GetPrice() * _firstTimeDiscount;
                _isFirstTime = false;
            } else {
                totalDiscount += product.GetPrice() * _otherDiscount;
            }
        }

        return totalDiscount;
    }
}
