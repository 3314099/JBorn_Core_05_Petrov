package ru.petrov.s02;

public class Task05 {

    public static void main(String[] args) {

        int result = comparison(3.95, 7);

        if (result == 2) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if (result == 1) {
            System.out.println("Площадь квадрата и площадь круга равны");
        } else {
            System.out.println("Площадь квадрата больше площади круга");
        }

    }

    public static int comparison(double radius, double side) {

        double circleArea = Math.PI * Math.pow(radius, 2);
        double squareArea = Math.pow(side, 2);

        if (circleArea > squareArea) {
            return 2;
        } else if (circleArea == squareArea) {
            return 1;
        } else {
            return 0;
        }

    }

}
