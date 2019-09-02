package com.company;

public class GetDiscountSimpleFactory {

    private DiscountContext _context;

    public GetDiscountSimpleFactory() {
        _context = new DiscountContext();
    }

    public DiscountCalculator getDiscountCalculator() {

        if(_context.isXmas()) {

            return new XmasDiscountCalculator();
        }



        throw new UnsupportedOperationException("Method is unfinished");
    }
}
