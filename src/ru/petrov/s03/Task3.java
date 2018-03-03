package ru.petrov.s03;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово:");
        String text = sc.nextLine();
        System.out.println("Введите символ:");
        String symb = sc.nextLine();


        int k = considerSymbols(text, symb);
        System.out.println("Количество символа " + symb + " в тексте: " + k);

    }

    public static int considerSymbols(String text, String symb) {

        int len = text.length();
        int k = 0;
        char sym = symb.charAt(0);

        for (int i = 0; i <= len - 1; i++) {
            if (text.charAt(i) == sym) {
                k++;
            }

        }
        return k;

    }

}
