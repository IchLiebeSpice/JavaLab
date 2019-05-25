/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.phone6;


public class People extends Phone {
    public People(String PhoneModel, int Years, int Sellprice) {
        super(PhoneModel, Years, Sellprice);
    }

    public static void main(String[] args)
    {   Phone phone1 = new Phone("iPhone",2015, 145000);
        Phone phone2 = new Phone("Samsung", 2013, 50000);
        Phone phone3 = new Phone("Meizu", 2012, 25000);
        Phone phone4 = new Phone("Xiaomi",2014, 30000);

        phone1.setPrice(145000);
        phone1.setYear(2015);
        phone1.setBrand("iPhone");
        phone1.setNumber(100);
        phone2.setPrice(50000);
        phone2.setYear(2013);
        phone2.setBrand("Samsung");
        phone2.setNumber(200);
        phone3.setPrice(25000);
        phone3.setYear(2012);
        phone3.setBrand("Meizu");
        phone3.setNumber(300);
        phone4.setPrice(30000);
        phone4.setYear(2014);
        phone4.setBrand("Xiaomi");
        phone4.setNumber(400);

        System.out.println("This phone is " + phone1.getBrand() + ", year " + phone1.getYear() + ", price " + phone1.getPrice());
        System.out.println("This phone is " + phone2.getBrand() + ", year " + phone2.getYear() + ", price " + phone2.getPrice());
        System.out.println("This phone is " + phone3.getBrand() + ", year " + phone3.getYear() + ", price " + phone3.getPrice());
        System.out.println("This phone is " + phone4.getBrand() + ", year " + phone4.getYear() + ", price " + phone4.getPrice());

        System.out.println("The total phone number is: " + phone1.getNumber());
        System.out.println("The total phone number is: " + phone2.getNumber());
        System.out.println("The total phone number is: " + phone3.getNumber());
        System.out.println("The total phone number is: " + phone4.getNumber());

    }
}