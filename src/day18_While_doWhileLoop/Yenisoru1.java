package day18_While_doWhileLoop;

import java.util.Scanner;

public class Yenisoru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;
        int birlerBamagi=0;




        while (sayi>0){
           birlerBamagi=sayi%10;
           rakamlarToplami+=birlerBamagi;
           sayi/=10;

        }System.out.print(rakamlarToplami);

    }
}
