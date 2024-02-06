package d16methodcreation_overloading_passbyvalue;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        /*Pass by Value (Değer ile Geçiş):

        Bir değişkenin değerini, yani veriyi, bir metoda parametre olarak ilettiğinizde, aslında o değişkenin
        bir kopyasını iletirsiniz. Metodun içinde bu kopya değiştirilse bile, orjinal değişkenin değeri değişmez.
        Degisken ve Object’lerin adreslerinin (reference) kopyasinda calisilir. */

        int x = 3;
        int y = 5;

        add(x, y);


    } //main disi

    public static int add(int a, int b){
        return a + b;
    }


}
