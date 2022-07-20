package org.example;

public  class basicPackage extends dominosOfferPakage {

    @Override
    protected void CreatPackage() {
        foodItems.add(new pizza());
        foodItems.add(new coke());
        foodItems.add(new frenchFries());
    }
}
