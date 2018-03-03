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

        StringBuilder stars = new StringBuilder();

        for (int i = 0; i <= word.length() - 1; i++) {
            stars.append('*');
        }

        return stars + word + stars;

    }

}
