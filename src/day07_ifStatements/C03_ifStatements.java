package day07_ifStatements;

public class C03_ifStatements {
    public static void main(String[] args) {
        int sayi=-20;
        if (sayi>0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");

        }
        if (sayi%2==0){
            System.out.println("sayi cit");
            System.out.println("cift kalacaktir");
        }

        if (sayi%5==0)
            System.out.println("sayi 5'in tam kati");
    }
}

