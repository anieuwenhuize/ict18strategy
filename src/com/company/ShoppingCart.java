package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> _items;

    public ShoppingCart() {
        _items = new ArrayList<>();
    }

    public void accept(Product product) {
        _items.add(product);
    }
}
