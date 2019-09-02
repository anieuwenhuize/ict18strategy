package com.company;

public class BunchOfGrapes extends Product {

    static double fixedPrice = 2.39;

    public BunchOfGrapes(String color) {
        super("Bunch of " + color + " grapes", fixedPrice);
    }
}
