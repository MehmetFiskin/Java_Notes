package day01_variables;

import java.util.Scanner;


public class Factorial {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();

        calculateFactorial(num);

    }
    public static void calculateFactorial(int num) {

        int factoriel = 1;

        for (int i = 1; i <= num; i++) {

            factoriel = factoriel * i;

        }

        System.out.println("Factoriel of " + num + " is " + factoriel);
    }

}
