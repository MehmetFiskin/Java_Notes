package day03_scanner;

public class C01_Asciitable {
    public static void main(String[] args) {

        int sayi=10;
        char harf='a';
        System.out.println(sayi+harf);

        String str="banan";

        System.out.println(str+harf);

        System.out.println(""+sayi+harf);

        char deger='1';
        System.out.println(deger+harf);



    }

    public static class C02_Swap {
        public static void main(String[] args) {

            int sayi1=10;
            int sayi2=20;
            int sayi3=0;

            sayi3=sayi2;
            sayi2=sayi1;
            sayi1=sayi3;

            System.out.println("swap'dan sonra sayi1 :"+sayi1);
            System.out.println("swap'dan sonra sayi1 :"+sayi2);



        }
    }
}
