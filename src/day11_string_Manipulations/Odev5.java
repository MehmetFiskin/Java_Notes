package day11_string_Manipulations;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen emailinizi yaziniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresi giriniz");

        }
    }
}
