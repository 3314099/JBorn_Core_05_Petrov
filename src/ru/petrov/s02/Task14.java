package ru.petrov.s02;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        for (int i = 0; i <= a; i++) {
            String str = mult(i);
            System.out.println(str);
        }

    }

    public static String mult(int i) {
        String str = "";

        for (int k = i; k > 0; k--) {
            str = str + "*";
        }
        return str;

    }

}


/*
    //S02-T14.    14.    Вывести треугольник в консоль. Где кол-во звездочек на последнем уровне передается параметром
    // *
    // **
    // …….
    // *****************


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        for (int i = 0; i <= a; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

