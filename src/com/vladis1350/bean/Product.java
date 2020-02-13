package com.vladis1350.bean;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double actualPrice() {
        double discount = getRegularPrice() * getDiscount() / 100;
        return getRegularPrice() - discount;
    }

    public void printInformation(){
        System.out.println("Product : name = " + getName() +", regular price = " + getRegularPrice() + " EUR, discount = " +
                + getDiscount() + "%, actual price = " + actualPrice() + " EUR");
    }
}
