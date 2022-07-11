package day08_ifstatements;

import java.util.Scanner;

public class C01_IfElseStattements {
    public static void main(String[] args) {
        // Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        }else if (gun.equals("sali")){
            System.out.println("Sal");
        }

    }
}
