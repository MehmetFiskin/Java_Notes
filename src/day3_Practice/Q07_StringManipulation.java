package day3_Practice;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() == 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Lutfen 4 harfli bir kelime giriniz");

        }
    }
}