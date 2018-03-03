package ru.petrov.s03;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = sc.nextLine();

        int k = considerWords(text);
        System.out.println("Количество слов в тексте: " + k);

    }

    public static int considerWords(String text) {

        int len = text.length();
        int k = 1;


        for (int i = 0; i <= len - 1; i++) {
            if (text.charAt(i) == ' ') {
                k++;
            }

        }
        return k;

    }
}
