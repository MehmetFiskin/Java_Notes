package day18_While_doWhileLoop;

public class Yenisoru {
    public static void main(String[] args) {
        for (int i =100; i <1000 ; i++) {
            while (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
                i++;
            }

        }
        System.out.println("");

        int bas=100;
        int bitis=999;
        int temp=bas;
        while (temp<bitis){
            if (temp%15==0 && temp%20==0 && temp%90==0){
                System.out.print(temp + " ");
            }temp++;
        }

        System.out.println("");



    }
}