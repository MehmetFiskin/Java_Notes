package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        /* Verilen bir String'de herhangi bir String veya char'in
           ilk kullanildigi index'i bize dondurur
         */
        String str = "java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); //5
        System.out.println(str.indexOf('g')); //6

        System.out.println(str.indexOf("t")); // bana integer donduruyor
        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index'idir.
        // - bir deger donerse biz aranan stringin str'de olmadigini anlariz.
        // Java -1 dondurmeyi tercih etmistir.
        String str5 = "werfgfeg;kjfhhpsouihgwouhglsfhlsjdnv";
        if (str5.indexOf("P") == -1) {

            System.out.println("str5'de istenen karakter kullanilmamis");
        } else {
            System.out.println("str5'de istenen karakter kullanilmis");
        }


    }
}
