package com.company;

public class Product {

    private double _price;
    private String _description;

    public Product(String _description, double price) {
        _price = price;
        _description = _description;
    }

    public double GetPrice() {

        return _price;
    }
}
