package Practice01;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen birinci tane tam sayiyi yaziniz : ");
        int a= scan.nextInt();
        System.out.print("lutfen ikinci tane tam sayiyi yaziniz : ");
        int b=scan.nextInt();

        System.out.println("toplam : " +(a+b));


    }
}
