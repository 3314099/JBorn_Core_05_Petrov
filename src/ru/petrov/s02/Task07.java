package ru.petrov.s02;

public class Task07 {

    public static void main(String[] args) {

        int pal = palindrome(232);

        if (pal == 1) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }

    }

    public static int palindrome(int x) {

        int array[] = new int[3];

        for (int i = 0; i <= 2; i++) {
            int div = x % 10;
            array[i] = div;
            x = x / 10;
        }

        int pal = 1;
        int k = 2;

        for (int i = 0; i <= 2; i++) {
            if (array[i] != array[k]) {
                pal = 0;
            }

            k--;
        }

        return pal;

    }

}
