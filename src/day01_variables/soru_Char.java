package day01_variables;

import java.util.Scanner;

public class soru_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toLowerCase().charAt(0);

        switch (karakter){
            case 'a':
                System.out.println("Your request is being processed is printed");
                break;
            case 'b' :
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'c' :
                System.out.println("Sorry, no help is currently available is printed");
                break;
            default:
                System.out.println("Invalid entry, please try again");

        }


    }
}
