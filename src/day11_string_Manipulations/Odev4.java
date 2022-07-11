package day11_string_Manipulations;

import java.util.Scanner;

public class Odev4 {
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

        if (cumle.lastIndexOf(kelime)==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (cumle.lastIndexOf(kelime,cumle.lastIndexOf(kelime)-1)==-1) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");

        }else{
            System.out.println("verilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
