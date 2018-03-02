package ru.petrov.s02;

public class Task07 {

    public static void main(String[] args) {

        boolean pal = palindrome(435);

        if (pal == true) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }

    }

    public static boolean palindrome(int x) {

        boolean pal = (x / 100 % 10 == x % 10);

        return pal;

    }

}
