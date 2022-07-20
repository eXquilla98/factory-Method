package org.example;

public class foodItem {
    private String foodName;

    public foodItem(String foodName){
        this.foodName = foodName;

    }
    @Override
    public String toString(){

        return foodName;
    }

}
