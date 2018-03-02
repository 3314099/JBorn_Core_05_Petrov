package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {

        boolean com = comparison(1, 3000);

        if (com) {
            System.out.println("Значение в километрах больше значения в футах");
        } else {
            System.out.println("Значение в километрах меньше значения в футах");
        }
    }

    public static boolean comparison(int km, int foot) {

        boolean com = km > (foot * 0.000305);

        return com;
    }

}


