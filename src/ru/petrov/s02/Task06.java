package ru.petrov.s02;

public class Task06 {

    public static void main(String[] args) {

        int div = div(11, 5);

        if (div > 0) {
            System.out.println(div);
        } else {
            System.out.println("m на n нацело не делится");
        }

    }

    public static int div(int m, int n) {

        if (m % n == 0) {
            return m / n;
        } else {
            return 0;
        }
    }

}

