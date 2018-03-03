package ru.petrov.s02;

public class Task08 {

    public static void main(String[] args) {

        boolean check = recurringNumberCheck(344);

        if (check == true) {
            System.out.println("Есть повторяющееся число");
        } else {
            System.out.println("Нет повторяющихся чисел");
        }

    }

    public static boolean recurringNumberCheck(int x) {

        return ((x / 100 == x / 10 % 10) || (x / 100 == x % 10) || (x / 10 % 10 == x % 10));

    }

}
