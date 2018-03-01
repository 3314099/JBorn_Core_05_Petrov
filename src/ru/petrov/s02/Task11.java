package ru.petrov.s02;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            String str = mult(a, i);
            System.out.println(str);
        }
    }

    public static String mult(int a, int i) {

        String str = a + "*" + i + "=" + a * i;
        return str;

    }

}
