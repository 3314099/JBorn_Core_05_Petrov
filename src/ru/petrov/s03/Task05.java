package ru.petrov.s03;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Введите слово:");
        word = sc.nextLine();

        Boolean pal = palindrome(word);

        if (pal) {
            System.out.println("Слово: " + word + " является перевёртышем");
        } else {
            System.out.println("Слово: " + word + " не является перевёртышем");
        }

    }

    public static boolean palindrome(String word) {

        int len = word.length();
        int k = len;
        boolean pal = true;

        for (int i = 0; i <= len - 1; i++) {

            if (pal == true && word.charAt(i) == word.charAt(k - 1)) {
                pal = true;
            } else {
                pal = false;
                break;
            }
            System.out.println(word.charAt(i) + "=" + word.charAt(k - 1));

            k--;
        }
        return pal;

    }
}

