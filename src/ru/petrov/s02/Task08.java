package ru.petrov.s02;

public class Task08 {

    public static void main(String[] args) {

        boolean check = recurringNumberCheck(243);

        if (check == true) {
            System.out.println("Есть повторяющееся число");
        } else {
            System.out.println("Нет повторяющихся чисел");
        }

    }

    public static boolean recurringNumberCheck(int x) {

        boolean check;
        check = ((x / 100 % 10 == x % 10) || (x / 10 % 10 == x % 10) || (x / 100 % 10 == x / 10 % 10));

        return check;

    }

}
