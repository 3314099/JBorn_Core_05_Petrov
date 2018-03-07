package ru.petrov.s03;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = sc.nextLine();
        System.out.println("Введите символ:");
        char symb = sc.next().charAt(0);


        int k = considerSymbols(text, symb);
        System.out.println("Количество символов " + symb + " в тексте: " + k);

    }

    public static int considerSymbols(String text, char symb) {

        int len = text.length();
        int k = 0;

        for (int i = 0; i <= len - 1; i++) {
            if (text.charAt(i) == symb) {
                k++;
            }

        }

        return k;

    }

}