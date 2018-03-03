package ru.petrov.s03;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст, представляющий собой десятичную запись целого числа.");
        String number = sc.nextLine();

        int sum = sumNumbers(number);
        System.out.println("Сумма цифр числа " + number + " = " + sum);

    }

    public static int sumNumbers(String number) {


        int len = number.length();
        int sum = 0;

        for (int i = 0; i <= len - 1; i++) {
            if (number.charAt(i) == '.') {
                break;
            }
            sum = +sum + Character.getNumericValue(number.charAt(i));
        }

        return sum;

    }
}
