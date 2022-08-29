package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {
        String str;
        str=null;
        //System.out.println(str.length());
        //NullPointerException   Cannot invoke "String.length()" because "str" is null

        /*
        deger atamasi yapmadan bir variable ı kullanmaya calısırsanız
        java Compile time da  bunu farkeder ve size izin vermez
         */

        //-ClassCastException-//

        Object obj="Java Java Java";//Sen obje bir variable ı integer a normalde cevirebilirdin ama iceği doğru değil diyor.
        Integer sayi=(Integer) obj;

        /*String str2= "Hava Civa";
        Integer sayi2=str2;
        Java bazi casting islemlerine compile time'da izin vermez

        Ancak bazen syntax uygun olabilir bu durumda java kodun calısmasına
        itiraz etmez.
         */

        //-IllegalArgumentException-//
        /*
        örneğin kullanicidan yasini girmesini isteyin ama kullanici gıcıklık yapıp negatif sayi girerse
        exception fırlat diyorsak olay basit

         */
    }
}
