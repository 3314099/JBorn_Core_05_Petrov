package ru.petrov.s02;

public class Task08 {

    public static void main(String[] args) {

        boolean check = recurringNumberCheck(345);

        if (check == true) {
            System.out.println("Есть повторяющееся число");
        } else {
            System.out.println("Нет повторяющихся чисел");
        }

    }

    public static boolean recurringNumberCheck(int x) {

        int num1, num2, num3;
        num1 = x / 100;
        num2 = x / 10 % 10;
        num3 = x % 10;

        return ((num1 == num2) || (num1 == num3) || (num2 == num3));

    }

}
