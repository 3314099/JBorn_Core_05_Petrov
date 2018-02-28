package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {
        double a = val(1,300);
        if (a == 1){
            System.out.println("Значение в колометрах больше значения в футах");
        } else{
            System.out.println("Значение в колометрах меньше значения в футах");
        }
    }

    public static double val(double x, double y) {
        int a = 0;
        if (x > (y * 0.000305)){
            a = 1;
        }
        return a;
    }

}


