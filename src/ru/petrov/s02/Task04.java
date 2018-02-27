package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {
        new Task04();
    }

    public Task04(){

        int x ,y ;
        x = 1; // км
        y = 3000; // футы: 1фут = 0.305м

        System.out.println(Math.min(x , (y * 0.000305)));

    }

}

