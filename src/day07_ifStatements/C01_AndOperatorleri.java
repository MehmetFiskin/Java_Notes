package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b);

        System.out.println(a<0 & b<20 & c>=b);

        /*
        java and operatörü konusuda bize iki seçenek sunar.
        EĞER
        && : kullanırsak ilk false bulduğunda artık sonucun false olacağını bilir ve geriye kalan şartları incelemez
        EĞER
        && : kullanırsak sonuç yine aynı olsa bile tüm şartları kontrol eder, sonra sonucu belirler.
        Bu çalışma usulünden dolayı & operatörü && operatörüne göre daha yavaş olabilir.
         */


    }
}
