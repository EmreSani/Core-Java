package javaders.d28exceptions_enum_iterators;

public class E02 {
    public static void main(String[] args) {

        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);

    } //main disi

    public static void getir(int[] c, int a, int b) {

        try {

            int idx = a / b;
            int element = c[idx];
            System.out.println(element); //9

        } finally {

            System.out.println("Database ile baglantiyi kesiniz");

        }
        System.out.println("Finally sonrasi app calisiyor");
    }

}
