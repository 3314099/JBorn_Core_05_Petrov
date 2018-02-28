package ru.petrov.s02;

public class Task03 {

    public static void main(String[] args) {

        int a = compare(7, 5);

        if (a == 1) {
            System.out.println("Первое число больше второго");
        } else if (a == 2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Второе число больше первого");
        }

    }

    public static int compare(int x, int y) {
        if (x > y) {
            return 1;
        } else if (x == y) {
            return 2;
        } else {
            return 0;
        }
    }

}