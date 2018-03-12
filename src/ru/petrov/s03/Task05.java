package ru.petrov.s03;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Введите слово:");
        word = sc.nextLine();

        Boolean isPal = isPalindrome(word);

        if (isPal) {
            System.out.println("Слово: " + word + " является перевёртышем");
        } else {
            System.out.println("Слово: " + word + " не является перевёртышем");
        }

    }

    public static boolean isPalindrome(String word) {

        int len = word.length();

        for (int i = 0; i <= len - 1; i++) {

            if (word.charAt(i) != word.charAt(len - i - 1))
                return false;
        }

        return true;

    }

}

