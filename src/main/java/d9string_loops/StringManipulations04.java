package d9string_loops;

public class StringManipulations04 {
    public static void main(String[] args) {
        /* Java’da memory kullanimi: Java’da bellek (memory) yönetimi, büyük ölçüde Java Virtual Machine (JVM)
        tarafından otomatik olarak gerçekleştirilir.

        Java'da iki ana bellek alanı vardır:

        Heap (yigin) ve Stack (yigin).
        ==>Heap, dinamik olarak oluşturulan Object’ler için kullanılır.
        Yani, new anahtar kelimesi ile oluşturduğunuz nesneler heap bölgesinde saklanır.

        ==>Stack, metod çağrıları ve lokal değişkenler (int x = 10;) için kullanılır.
        //Stack daha hızlıdır ancak boyutu sınırlıdır.Adresleme burasidir.Buyuk bir ulkenin navigasyonu gibi.

        ==>Primitive türler (int, char, float, double, boolean, byte, short, long) stack belleğinde saklanır.
        ==>Non-primitive ya da referans türleri (örneğin, Object’ler ve Array’ler) heap belleğinde saklanır.
        Stack belleğinde sadece bu nesnelerin referansları (adresleri) saklanır.

        Java ve benzeri yüksek seviye diller, referansları-reference stack belleğinde ve
        asıl nesne verilerini heap belleğinde saklar.Bu yaklaşım, hem hızlı erişim hem de
        dinamik bellek yönetimi(basit - cunku heap karisik) arasında bir denge sağlar.*/

        String s = "Tom";

        int a = 12;

        /*
        memory kullanimi:

        String’lerin esitliklerini kontrol ederken "==" yerine equals kullaniriz
        cunku == kullanirsaniz, iki String’i karsilastirirken adreslerini kontrol eder.

        equals() methodu ise iki String’i karsilastirirken sadece degerlerine bakar,
        degerleri ayni ise bu iki String esittir der, degerler farkli ise bu iki String farklidir der
         */

        String str1 = new String("merhaba");
        String str2 = new String("merhaba");
        String str3 = str1;

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str3); //true

        String s1 = "ali";
        String s2 = "ali";
        System.out.println(s1 == s2); //true

    }
}