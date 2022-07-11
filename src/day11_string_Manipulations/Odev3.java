package day11_string_Manipulations;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf yaziniz");
        String harf=scan.next();

        if (cumle.lastIndexOf(harf)==-1){
            System.out.println("harf yoktur");

        }else {
            System.out.println("harf vardir");
        }

    }
}
