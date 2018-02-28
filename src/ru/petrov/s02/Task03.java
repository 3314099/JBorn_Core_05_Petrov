package ru.petrov.s02;


public class Task03 {

    public static void main(String[] args) {
    int x,y;
    x = 5;
    y = 6;

        int max = max(x,y);
        System.out.println(max);
        int min = min(x,y);
        System.out.println(min);
    }

    public static int max (int x, int y) {


        int max = Math.max(x, y);

        return max;
    }

    public static int min (int x, int y) {


        int min = Math.min(x, y);

        return min;
    }

}