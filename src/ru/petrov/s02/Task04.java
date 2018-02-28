package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {

        int a = val(1, 30000);

        if (a == 1) {
            System.out.println("Значение в километрах больше значения в футах");
        } else {
            System.out.println("Значение в километрах меньше значения в футах");
        }
    }

    public static int val(int x, int y) {

        int a;

        if (x > (y * 0.000305)) {
            a = 1;
        } else {
            a = 0;
        }

        return a;
    }

}


