package com.chmnu;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();

        double x = -3.2, a = 7.1, b = 4.1, c = 5;
        double y = Math.pow(a, -b * x) * Math.cos((Math.abs(c * x - a)) / (b * x * x + c));

        //double randNumber = 1 + (100 - 1) * rand.nextDouble();
        double x1 = 1 + (10 - 1) * rand.nextDouble();
        double a1 = 1 + (10 - 1) * rand.nextDouble();
        double b1 = 1 + (10 - 1) * rand.nextDouble();
        double c1 = 1 + (10 - 1) * rand.nextDouble();

        double y1 = Math.pow(a1, -b1 * x1) * Math.cos((Math.abs(c1 * x1 - a1)) / (b1 * x1 * x1 + c1));
        System.out.println(y);

        System.out.println(y1);
    }
}