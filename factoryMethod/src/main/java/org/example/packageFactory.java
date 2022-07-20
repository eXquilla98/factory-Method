package org.example;

public class packageFactory {
    public static dominosOfferPakage createPackage(code code){

        switch (code){

            case basicPackage :
                return new basicPackage();
            case familyPackage:
                return new familyPackage();
            case newYearpackage:
                return new newYearpackage();
            default:
                return null;


        }



    }
}
