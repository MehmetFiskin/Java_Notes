package day07_ifStatements;

import java.util.Scanner;

public class C04_BasicIfStatements {
    public static void main(String[] args) {
        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazar")  || girilenGun.equals("cumartesi")){
            System.out.println("girilen gun HAFTASONU");
        }


        if (girilenGun.equals("pazartesi")  || girilenGun.equals("sali")  || girilenGun.equals("carsamba") ||girilenGun.equals("persembe")){
            System.out.println("girilen gun HAFTAICI");


        }



    }
}
