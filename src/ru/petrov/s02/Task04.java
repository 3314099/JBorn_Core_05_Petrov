package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {

        int result = comparison(0.305, 1000);

        if (result == 2) {
            System.out.println("Значение в футах меньше значения в километрах");
        } else if (result == 1) {
            System.out.println("Значение в километрах равно значению в футах");
        } else {
            System.out.println("Значение в километрах меньше значения в футах");
        }
    }

    public static int comparison(double km, double foot) {

        if (km > foot * 0.000305) {
            return 2;
        } else if (km == foot * 0.000305) {
            return 1;
        } else {
            return 0;
        }

    }

}


