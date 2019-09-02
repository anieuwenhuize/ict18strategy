package com.company;

public class GrazyMondayDiscountCalculator extends DiscountCalculator {

    // 3. Op grazy-monday krijg je evenveel korting als het aantal artikelen dat je bestelt.
    @Override
    public double getDiscount(ShoppingCart cart) {
        return 0;
    }
}
