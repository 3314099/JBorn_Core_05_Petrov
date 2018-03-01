package ru.petrov.s02;

public class Task10 {

    public static void main(String[] args) {

        String str = day(1);
        System.out.println(str);
    }

    public static String day(int x) {

        String str;
        switch (x) {
            case 1:
                str = "Понедельник";
                break;
            case 2:
                str = "Вторник";
                break;
            case 3:
                str = "Среда";
                break;
            case 4:
                str = "Четверг";
                break;
            case 5:
                str = "Пятница";
                break;
            case 6:
                str = "Суббота";
                break;
            case 7:
                str = "Воскресенье";
                break;
            default:
                str = "Введённое значение не верно";
        }
        return str;
    }

}
