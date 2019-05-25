/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.phone6;

/**
 *
 * @author 1710523
 */

public class Phone {
    private int yearModel;
    private String brand;
    private int priceModel;
    private int numberModel;
    

    public Phone (String b, int year, int price, int number, int speed) {
        yearModel = year;
        brand = b;
        priceModel = price;
        numberModel = number;


    }

    public Phone(String PhoneModel, int Years, int Sellprice) {
    }

    public int getYear() {
        return yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return priceModel;
    }

    public int getNumber() {
        return numberModel;
    }

    public void setYear(int year) {
        yearModel = year;
    }

    public void setBrand(String carBrand) {
        brand = carBrand;
    }

   // @SuppressWarnings("unused")
    public void setPrice(int price) {
        priceModel = price;


    }
    public void setNumber(int number) {
        numberModel = number;


    }
}

