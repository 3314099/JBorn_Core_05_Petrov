package ru.petrov.s03;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = sc.nextLine();
        sc.close();

        String str = makeStars(word);
        System.out.println(str);

    }

    public static String makeStars(String word) {

        int len = word.length();
        String str;
        String stars = "";

        for (int i = 1; i <= len; i++) {
            stars = stars + "*";
        }
        str = stars + word + stars;
        return str;

    }

}
