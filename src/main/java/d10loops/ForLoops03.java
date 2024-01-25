package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {

        //ornek 1: 6'dan 10'a kadar tum int'lerin toplamini console'a yazdiriniz
        //           6+7+8+9+10=40 ==> 40

        int toplam = 0;

        for (int i = 6; i < 11; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam); //40

    }
}