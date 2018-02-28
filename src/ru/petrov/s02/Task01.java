package ru.petrov.s02;
import java.util.Scanner;

    public class Task01 {

        public static void main(String[] args) {
            int a = sum(56);
            System.out.println(a);
        }

        public static int sum(int n) {


            int a = n % 10;
            int b = n / 10;
            int sum = a + b;
            return sum;
        }

    }

/*

//Нашел еще крутой вариант(очень мне понравился) - помог понять!!

    public static void main(String[] args) {


        int n = 5661;
        int sum = 0;
        sum(n, sum);
    }

        public static void sum(int n, int sum){

        if(n!=0){
            sum+=n%10;
            sum(n/10, sum);

        }
        else System.out.println(sum);
        }
}
*/


