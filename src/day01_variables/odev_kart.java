package day01_variables;

import java.util.Scanner;

public class odev_kart {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Lutfen 16 rakamli kart numarinizi giriniz");
        String kartNo= scan.nextLine();
        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");
        String soyIsimIlkHarf=soyIsim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar=soyIsim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKlanlar=" **** **** ****";
        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+soyIsimIlkHarf+soyIsimGeriyeKalanlar+"\n"+
                kkIlk4+kkGeriyeKlanlar);



    }
}
