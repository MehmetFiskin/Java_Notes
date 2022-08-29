package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
         /*
        Soru: kullanicidan yasini giremsini isteyin
        kodunuzu kullanici sifirdan kucuk bir sayi girerse exception verecek sekilde yazın

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<0) {
                throw new IllegalArgumentException("Invalid age");
            }else {
                System.out.println("yasiniz :" + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
