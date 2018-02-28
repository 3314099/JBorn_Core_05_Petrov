package ru.petrov.s02;

public class Task05 {

    public static void main(String[] args) {
        val(3, 7);
    }

    public static double val(double x, double y) {

        x = Math.PI * Math.pow(x, 2);
        y = Math.pow(y, 2);

        if (x > y) {
            System.out.println("Площадь круга " + x + " больше площади квадрата " + y);
            return y;
        } else {
            System.out.println("Площадь квадрата " + x + " больше площади круга " + y);
            return x;
        }
    }

}
