/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

/**
 *
 * @author 1710523
 */
import java.util.Scanner;
public class Laba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Функція з заданими параметрами");
        System.out.println("2.Функція з віпадковими параметрами");
        double a = -3, b = 4, c = 1.2, x = 0.5;
        double y1, y2;
        y1 = function(a, b, c, x);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("y = " + y1);
                break;
            case 2:
                System.out.print("Input a minimum: ");
                int min = scan.nextInt();
                System.out.print("Input a maximum: ");
                int max = scan.nextInt();
                double aa = Math.random() * (max - min) + min;
                double bb = Math.random() * (max - min) + min;
                double cc = Math.random() * (max - min) + min;
                double xx = Math.random() * (max - min) + min;
                while(xx>=4) {
                     xx = Math.random() * (max - min) + min;
                }
                y2 = function(aa, bb, cc, xx);
                System.out.println("y = " + y2);
                break;
        }
    }

    static double function(double a, double b, double x, double c) {
        return (Math.acos(Math.pow(a+x,1.0/4.0))/(b-x))+Math.pow(c, Math.log(4-x));
    }

}
