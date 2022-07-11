package day13_MethodCreation;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
       /* Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. Kullanici
        toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben
        toplayamam” yazdirin

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("kac adet sayi gireceksiniz :");
        int adet = scan.nextInt();
        int toplam = 0;
        if (adet <= 4) {
            for (int i = 1; i <= adet; i++) {
                System.out.println(i + " .sayiyi giriniz :");
                int sayi = scan.nextInt();
                toplam += sayi;

            }
            System.out.println("toplam :" + toplam);


        }else{
            System.out.println("Cok sayi girdiniz, ben toplayamam" );
        }


    }

}

