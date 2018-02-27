package ru.petrov.s02;

public class Task02 {

    public static void main(String[] args) {
        new Task02();
    }

    public Task02(){

        int x = 5; // значение
        int i = 2; //степень

        //  double y = Math.sin(x);
        double y;

        if (x > 0) {
            y = Math.pow(Math.sin(x), i);
        } else {
            y = 1 - (2 * Math.sin(Math.pow(x, i)));
        }

        System.out.printf("y равен %.8f \n", y);

    }

}
