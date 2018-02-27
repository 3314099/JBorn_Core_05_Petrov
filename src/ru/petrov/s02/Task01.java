package ru.petrov.s02;

public class Task01 {

    public static void main(String[] args) {
        new Task01();
    }

    public Task01(){
        int a, sum, b;
        a = 56;
        sum = 0;
        String с = Integer.toString(a);
        b = с.length();

        for(int i = 0; i < b; i++) {
            sum += Character.getNumericValue(с.charAt(i));
        }
        System.out.println(sum);

    }
}
