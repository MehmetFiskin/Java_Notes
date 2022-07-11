package day01_variables;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        leapYear(year);

    }

    public static void leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {

            System.out.println(year + " is a Leap Year");

        } else if (year % 400 == 0) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

    }

}
