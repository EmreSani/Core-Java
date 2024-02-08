package d18datetime_stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) "StringBuilder" class da String ureten bir class tir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder Class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
         ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
        */

        String s = "Java"; //Java
        String t = s + "x"; //Javax
        String w = t + "?"; //Javax?

        //Bir String variable olusturup, sonra ona baska String degerleri concatinate ettiginizde,
        // her seferinde heap memory’de yeni bir String objesi olusur. Orjinal deger degismez

        String c = "Ali"; //String pool
        String d = "Ali";

        String e = new String("Ali");

        //String pool
        //Bellek verimliligi -avantaj
        //Esneklik eksikligi - Dezavantaj
        //-------------------

        //StringBuilder b = "Ali"; bu sekilde object uretemeyiz. "" String uretir

        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); //Python

        sb1.append("!");
        System.out.println(sb1); //Python!

        //---------------------
        //Peki, bir String'i degistirdikten sonra tekrar ayni String'e yuklersem orjinal deger degismez mi?

        String a = "money";

        a = a + " more";

        /*
        1-String’i degistirdikten sonra ayni String’e assign ederseniz Java yine yeni bir container olusturur.
        2-Degismis degeri bu yeni container’in icine koyar ve eski container’i gosteren
        pointer yeni container’a yonlendirilir
        3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
        adressiz olan container’lari siler. GC bellek sızıntılarını önler.
        GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
        Veri memory’de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
        ve uygulamadan bağımsızdır*/
        //-----------------
        //capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx"); //15 tane x
        System.out.println(sb2.length()); //4 //19
        System.out.println(sb2.capacity()); //16 //34


    }
}
