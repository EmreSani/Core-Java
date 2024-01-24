package d4casting_scanner_increment;

public class Operators {
    public static void main(String[] args) {
        /*
        +,-,*,/ islemleri Java’da matematikte kullanildigi gibi kullanilir
        Not 1: Java’da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini silerek onu int’e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
        */

        int paraMiktari = 25;
        int kisiSayisi = 10;
        System.out.println(paraMiktari / kisiSayisi); //2, 2.5 cikmaliydi Java noktadan sonrayi sildi

        double ucretMiktari = 25;
        int ogrenciSayisi = 10;
        System.out.println(ucretMiktari / ogrenciSayisi); //2.5
        //Buyuklukten kasit, daha fazla bilgi saklayabilmektir
        //-------------------------------
        /*2) Java da “logical operator" lar.
       ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
       AND islemini carpma olarak dusunebiliriz

       ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
       OR isleminde sonucun false olabilmesi icin hersey false olmalidir

       //==> NOT Operatoru (!) true olani false , false olani true yapar
       !true  ==> false
       !false ==> true
       !!true ==> true*/

        /*3) Comparison (Karsilastirma) Operators
        <, >, <=, >=, ==, !=
        Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/

        boolean a = 3 < 5; //true
        boolean b = 2 + 3 != 5; //false
        boolean c = 2 + 3 * 5 >= 19; //false, once carpma

        System.out.println(a && b); //false
        System.out.println(a || b || c); //true
    }
}
