package day06_concatenation;

public class C02_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2); //Java guzeldir 54

        System.out.println(str1+" "+str2+" " +(sayi1+sayi2)); //Java guzeldir 9

        System.out.println(sayi1+sayi2+" "+str1); //9 Java

        System.out.println(""+sayi1+sayi2+" "+str1);  //54 Guzeldir

        System.out.println(str1.concat(str2)); //Java guzeldir
        System.out.println(str1.concat(" ").concat(str2)); //Java guzeldir
    }
}
