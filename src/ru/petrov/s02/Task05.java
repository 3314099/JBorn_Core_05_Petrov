package ru.petrov.s02;

public class Task05 {

    public static void main(String[] args) {
        int com = comparison(3, 7);

        if (com == 1) {
            System.out.println("Площадь круга больше площади квадрата");
        } else {
            System.out.println("Площадь квадрата больше площади круга");
        }
    }

    public static int comparison(double radius, double side) {

        radius = Math.PI * Math.pow(radius, 2);
        side = Math.pow(side, 2);

        int com;

        if (radius > side) {
            com = 1;
        } else {
            com = 0;
        }

        return com;

    }

}
