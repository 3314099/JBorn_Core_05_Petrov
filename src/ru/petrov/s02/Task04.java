package ru.petrov.s02;

public class Task04 {

    public static void main(String[] args) {
       val(1,30000);
    }

    public static double val(double x, double y) {

        if (x > (y * 0.000305)){
            System.out.println( y + " футов меньше " + x + " километров");
            return y;
        } else{
            System.out.println( x +" колометров меньше " + y + " футов");
            return x;
        }
    }

}


