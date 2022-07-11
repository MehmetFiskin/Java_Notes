package day11_string_Manipulations;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
         /*
           Kullanicidan bir cumle ve kelime isteyin
             verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
            -verilen kelime cumlede kullanilmamis
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede 1'den fazla kullanilmis */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir kelime yaziniz");
        String kelime=scan.nextLine();



        /*String cumle="Java ile hayat guzel";
        String kelime="a";

         */

       if (cumle.indexOf(kelime)==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");

        } else if (cumle.indexOf(kelime,cumle.indexOf(kelime)+1)!=-1) {
            System.out.println("verilen kelime cumlede 1'den fazla kullanilmis");

        }else {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }



    }
}
