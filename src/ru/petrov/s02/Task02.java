package ru.petrov.s02;

public class Task02 {

    public static void main(String[] args) {
        double y = area(1);
        System.out.println(y);
    }

    public static double area(double n) {

        double z;

        if (n > 0) {
            z = Math.pow(Math.sin(n), 2);
        } else {
            z = 1 - (2 * Math.sin(Math.pow(n, 2)));
        }

        return z;
    }

}
