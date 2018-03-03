package ru.petrov.s02;

public class Task05 {

    public static void main(String[] args) {
        int com = comparison(3.94, 7);

        if (com == 2) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if (com == 1) {
            System.out.println("Площадь квадрата и площадь круга равны");
        } else {
            System.out.println("Площадь квадрата больше площади круга");
        }
    }

    public static int comparison(double radius, double side) {

        double circleArea = Math.PI * Math.pow(radius, 2);
        double squareArea= Math.pow(side, 2);

        int com;

        if (circleArea > squareArea) {
            com = 2;
        } else if (circleArea == squareArea) {
            com = 1;
        } else {
            com = 0;
        }

        return com;
    }
}
