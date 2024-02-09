package javaders.d7switch_ternary_string;

public class StringManipulations {
    public static void main(String[] args) {
        //String Data Tipi (Class)
        //String: String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        String s = "Java is easy";

        //length() methodu String'in uzunlugunu dondurur.1’den baslar

        int sLength = s.length();
        System.out.println(sLength); //12

        System.out.println("------------------");

        //Ornek 2: "s" String'inde ilk ve son index’teki karakterleri aliniz.

        //charAt(int index) metodu, belirtilen index’te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.

        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11); //Static Code
        System.out.println(lastChar); //y

        char lastChar2 = s.charAt(s.length()-1); //Dynamic Code
        System.out.println(lastChar2);

        System.out.println("----------------");


    }
}