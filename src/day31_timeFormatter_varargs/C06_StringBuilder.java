package day31_timeFormatter_varargs;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);

        sb1.deleteCharAt(3);

        sb1.reverse( );

        System.out.println(sb1);
    }
}
