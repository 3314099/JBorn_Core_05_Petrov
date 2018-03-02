package ru.petrov.s02;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();

        String str = multiplyNumber(number);
        System.out.println(str);

    }

    public static String multiplyNumber(int number) {

        int i = 1;
        String str = "";

        while (i <= 9) {
            str = str + number + "*" + i + "=" + number * i + "\r\n";
            i++;

        }

        return str;

    }

}
