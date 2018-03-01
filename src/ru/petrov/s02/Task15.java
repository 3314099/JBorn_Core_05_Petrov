package ru.petrov.s02;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; i += 2) {
            if (i > a) {
                return;
            }
            String str = mult(a, i);
            System.out.println(str);
        }

    }

    public static String mult(int a, int i) {
        String str = "";

        int br = (a - i) / 2;
        for (int k = 1; k <= br; k++) {
            str = str + " ";
        }
        for (int k = 1; k <= i; k++) {
            str = str + "*";
        }
        for (int k = 1; k <= br; k++) {
            str = str + " ";
        }

        return str;

    }

}
