package ru.petrov.s02;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();

        String str = multiplyTable(number);
        System.out.println(str);

    }

    public static String multiplyTable(int number) {

        String str = "";

        for (int i = 1; i <= 9; i++) {
            str = str + number + "*" + i + "=" + number * i + "\r\n";
        }

        return str;

    }

}
