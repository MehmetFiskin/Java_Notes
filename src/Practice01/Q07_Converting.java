package Practice01;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {

        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon



    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */
        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon+ " galon degeri" + litre + " litreye esittir";
        System.out.println(sonuc1);

        int lt=1000;
        double Gln=lt/3.785;
        System.out.println(lt + "litre degeri" + Gln + " gallona esittir");

        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz");
        double fhr=scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri :"  +  (fhr-32)*5/9  +  " santigrat'a esittir");



    }
}
