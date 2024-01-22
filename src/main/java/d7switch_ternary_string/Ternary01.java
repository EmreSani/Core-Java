package d7switch_ternary_string;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0
        //(c) ? (t) : (f)

        int c = -4;

        int result = c < 0 ? -1*c : c;
        System.out.println(result);

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
// “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int a = 4;
        int b = 7;

        //Neden surekli Object kullanmamaliyiz?
//Veri tipi guvenligi - tur donusumu hatasi alabilirsiniz
//Kod okunulabilirligi duser
//Performans duser
//Metod erisimi zorlasir
//Kod karmasiklasir

       Object sonuc = (a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "Farkli isaretli sayilari carpamiyorum";
       //Object Java'da butun non-primitive data typelarin ortak parentidir.
       System.out.println(sonuc);





    }
}
