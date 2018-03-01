package ru.petrov.s02;

public class Task09 {

    public static void main(String[] args) {

        double y = condition(2);

        System.out.println("y=" + y);

    }

    public static double condition(double x) {

        double y;
        if (x <= 0) {
            y = 0;
        } else if (x > 0 & x <= 1) {
            y = x;
        } else {
            y = Math.pow(x, 2);
        }

        return y;
    }

}
