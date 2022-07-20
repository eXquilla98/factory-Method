package org.example;

public class familyPackage extends dominosOfferPakage {
    @Override
    protected void CreatPackage() {
        foodItems.add(new pizza());
        foodItems.add(new pizza());
        foodItems.add(new pizza());
        foodItems.add(new coke());
        foodItems.add(new coke());
        foodItems.add(new coke());
        foodItems.add(new frenchFries());
        foodItems.add(new frenchFries());
        foodItems.add(new burger());
    }
}
