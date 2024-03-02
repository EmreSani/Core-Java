package javaders.d31lambda;

import java.util.stream.IntStream;

public class Lambda11 {
    public static void main(String[] args) {
       /* int sum = getSumFromSeventoSeventy();
        System.out.println(sum); //2464*/

        //System.out.println(getMultiplicationFromThreeToNine1()); //181440
        //System.out.println(getMultiplicationFromThreeToNine2()); //181440
        //System.out.println(getFactorial(-7));
        System.out.println(getSumOfBetweenTwoInteger(5, 12));

    }

    //1)  7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    /*
    a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream’de var)
    b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
    e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
    Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
    */

    public static int getSumFromSeventoSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact). //Math::addExact (overflow kontrolu var)yerine, Integer class'taki sum()'da kullanilabilirdi
                getAsInt();
    }

    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //multiplyExact - İki int veya long değerini çarpar. Math class'tadir

    //1.yol
    public static int getMultiplicationFromThreeToNine1() {
        return IntStream
                .rangeClosed(3, 9) //iki parametre de dahil
                .reduce(Math::multiplyExact)
                .getAsInt();
    }

    //2.yol
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream
                .range(3, 10) //2.parametre dahil degil
                .reduce(Math::multiplyExact)
                .getAsInt();
    }

    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.

    //3! = 1 * 2 * 3 = 6
    //0! = 1
    //Negatif sayıların faktöriyeli yoktur

    public static int getFactorial(int x) {

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Negatif sayilarin faktoriyeli yoktur");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

    }

    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.

    //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.

    public static int getSumOfBetweenTwoInteger(int a, int b) {

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }
}
