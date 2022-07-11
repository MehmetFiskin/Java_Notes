package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin//

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();//5267//

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkgirilenSayi=sayi;


        birlerBasamagi= sayi % 10;
        rakamlarToplami += birlerBasamagi;// rakamlarToplami=rakamlarToplami+birlerBasamagi
        sayi /=10;

        birlerBasamagi =sayi %10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        birlerBasamagi =sayi %10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;


        birlerBasamagi =sayi %10;
        rakamlarToplami += birlerBasamagi;
        sayi /=10;

        System.out.println(ilkgirilenSayi + " sayisinin rakamlar toplami :" + rakamlarToplami);










    }
}
