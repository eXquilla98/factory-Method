package org.example;

public class Main {
    public static void main(String[] args) {
        dominosOfferPakage offer1= packageFactory.createPackage(code.basicPackage);
        System.out.println("offer1 ");
        dominosOfferPakage offer2= packageFactory.createPackage(code.familyPackage);
        System.out.println("offer2 ");
        dominosOfferPakage offer3= packageFactory.createPackage(code.newYearpackage);
        System.out.println("offer3 ");
    }
}