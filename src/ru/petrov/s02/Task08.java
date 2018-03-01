package ru.petrov.s02;

public class Task08 {

    public static void main(String[] args) {

        int check = check(455);

        if (check == 0) {
            System.out.println("Нет повторяющихся чисел");
        } else {
            System.out.println("Есть повторяющееся число " + check);
        }

    }

    public static int check(int x) {

        int array[] = new int[3];

        for (int i = 0; i <= 2; i++) {
            int div = x % 10;
            array[i] = div;
            x = x / 10;
        }

        int check = 0;

        for (int i = 0; i <= 2; i++) {
            for (int k = 2; k >= 0; k--) {

                if ((i != k) & (array[i] == array[k])) {
                    check = array[i];

                }
            }
        }

        return check;

    }

}
