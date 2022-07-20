package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class dominosOfferPakage {
    protected List<foodItem> foodItems =new ArrayList<>();
    public dominosOfferPakage()
    {
        CreatPackage();
    }

    protected abstract void CreatPackage();
@Override
    public String toString(){
    return "Package{" + "offer"+foodItems+"}";


}


}
