package ru.petrov.s02;

public class Task01 {

    public static void main(String[] args) {
        int a = sum(56);
        System.out.println(a);
    }

    public static int sum(int n) {

        int a = n % 10;
        int b = n / 10;
        return a + b;
    }

}
