package day10_StringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";
        System.out.println(str.length()); // str'nin karakter sayisi
        System.out.println(str.charAt(str.length() - 1));//sondan 1. karakter
        System.out.println(str.charAt(str.length() - 3));//sondan 3. karakter

        /* java'da null pointer (isaretleyici) bir deger degil,
           karsisina yazildigi variable'ın hic bir deger almadiginin isaretcisidir.*/

        String str2 = " ";
        System.out.println(str2.length());  //0

        String str3 = null;
        System.out.println(str3.length());


    }
}
