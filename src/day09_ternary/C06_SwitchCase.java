package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
       String input="pazartesi";

       switch (input){

           case "pazartesi" :
           case "sali" :
           case "carsamba" :
           case "persembe" :
           case "cuma" :
               System.out.println("Hafta ici");
               break;
           case "cumartesi" :
           case "pazar" :
               System.out.println("Hafta ici");
               break;
           default:
               System.out.println("Lutfen gecerli bir gun yaziniz");

       }
    }
}
