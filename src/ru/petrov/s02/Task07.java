package ru.petrov.s02;

public class Task07 {

    public static void main(String[] args) {

        boolean isPal = isPalindrome(435);

        if (isPal == true) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }

    }

    public static boolean isPalindrome(int x) {

        return (x / 100 == x % 10);

    }

}
