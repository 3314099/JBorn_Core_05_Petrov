package ru.petrov.s03;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = sc.nextLine();
        sc.close();

        String rts = printPalidrom(word);
        System.out.println(rts);

    }

    public static String printPalidrom(String word) {

        int len = word.length();
        String rts = "";

        for (int i = len - 1; i >= 0; i--) {
            rts = rts + word.charAt(i);
        }
        return rts;

    }

}
