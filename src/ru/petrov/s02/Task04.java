package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {

        int com = comparison(1, 3000);

        if (com == 1) {
            System.out.println("Значение в километрах больше значения в футах");
        } else {
            System.out.println("Значение в километрах меньше значения в футах");
        }
    }

    public static int comparison(int km, int foot) {

        int com;

        if (km > (foot * 0.000305)) {
            com = 1;
        } else {
            com = 0;
        }

        return com;
    }

}


