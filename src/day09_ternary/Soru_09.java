package day09_ternary;

import java.util.Scanner;

public class Soru_09 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin. Sayi pozitifse "Sayi pozitif" yazdirin, negatifse sayinin karesini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi yaziniz");
        int a=scan.nextInt();



        System.out.println(a>=0 ? "sayi pozitif"  :  (a*a));




    }
}
