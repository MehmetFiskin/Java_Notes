package day13_MethodCreation;

public class Method_soru1 {
    public static void main(String[] args) {

       /* Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
        kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
        rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
        olusturun.

        */

        tekCift(57);
        sifirdanBuyukMu(41);
        yuzdenBuyukMu(126);



    }

    private static void yuzdenBuyukMu(int sayi) {
       int rakamlarToplam=0;
       int birlerBasamagi=0;

        if (sayi>=100){
            birlerBasamagi=sayi%10;
            rakamlarToplam+=birlerBasamagi;
            sayi/=10;
            birlerBasamagi=sayi%10;
            rakamlarToplam+=birlerBasamagi;
            sayi/=10;
            birlerBasamagi=sayi%10;
            rakamlarToplam+=birlerBasamagi;
            sayi/=10;
            System.out.println("rakamlar toplami :" + rakamlarToplam);

        }else {
            birlerBasamagi=sayi%10;

            System.out.println("birler basamagi :" +birlerBasamagi);
        }
    }

    public static void sifirdanBuyukMu(int sayi) {

        if (sayi<0){
            System.out.println("sayi negatiftir");
        }else if(sayi==0){
            System.out.println("sayi notr'dur");
        }else{
            System.out.println("sayi pozitiftir");
        }
    }

    public static void tekCift(int sayi) {

        if (sayi%2==0){
            System.out.println("sayi ciftir");
        }else{
            System.out.println("sayi tektir");
        }

    }
}
