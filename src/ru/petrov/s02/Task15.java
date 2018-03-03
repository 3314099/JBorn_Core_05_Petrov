package ru.petrov.s02;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        String str = createTriangle(a);
        System.out.println(str);

    }

    public static String createTriangle(int a) {

        if (a % 2 == 0) {
            a++;
        }

        String str = "";

        for (int i = 0; i <= a; i += 2) {

            for (int k = (a - i) / 2 - 1; k >= 0; k--) {
                str = str + " ";
            }

            for (int k = i; k >= 0; k--) {
                str = str + "*";
            }
            str = str + "\r\n";

        }

        return str;

    }

}
