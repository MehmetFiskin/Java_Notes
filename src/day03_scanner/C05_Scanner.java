package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanicidan 2 sayi alip bu sayilarin carpimini yazdirin//

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi girin");

        double sayi1=scan.nextDouble();

        System.out.println("Lutfen 2. sayiyi girin");

        double sayi2=scan.nextDouble();

        System.out.println("girilen sayilarin carpimi :"+sayi1*sayi2);

    }
}
