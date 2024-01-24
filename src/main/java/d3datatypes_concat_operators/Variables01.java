package d3datatypes_concat_operators;

public class Variables01 {
    public static void main(String[] args) {
        //3- int data type:
        //tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
        //-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir
        //-----------------------------
        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin.

        int ulkeNufusu = 84231768;
        System.out.println("Ulke Nufusu : " + ulkeNufusu);

        //ulkeNufusu.soutv ile de kisa yoldan etiketle yazdirabilirsiniz
        //-----------------------------
        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console’a yazdirin
        int a = 12, b = 13;
        System.out.println(a + b);
        //-----------------------------
        //4- long data type:
        //Tam sayilar icindir. Hafizada 8 byte (64 bit) yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)

        //Not: Long olustururken eger deger, Integerlarin maximum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz, yoksa "Integer number too large-Tam sayı çok büyük
        //“ hatasi alirsiniz.

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        long hucreSayisi = 12345678901L;
        System.out.println("hucreSayisi = " + hucreSayisi); //hucreSayisi = 12345678901

        //ornek 2: Iki tane Long variable olusturun ve toplamlarini bir etiketle console'a yazdirin
        long c = 12, d = 13;
        System.out.println("Toplam : " + (c + d)); //Toplam : 25
        //-----------------------------
        //5- float (flot) data type: Hafizada 32 bit - 4 byte yer kaplar
        //(Decimal Numbers ==> ondalikli sayilar) icin kullanilir.
        //Ozellikle fiyat degerleri icin "float" kullanilir. App'inizde bu data tipini secmelisiniz.

        //Dikkat :Java ondalikli sayilari otomatik olarak double kabul eder.(trigonometrik işlemler, logaritmalar vb.)
        // çok hassas sonuçlar gerektiğinde, double'ın daha yüksek hassasiyeti faydalı olabilir.
        // O yuzden default double dir.
        //float olmasina israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        // Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiket ile console'a yazdiriniz
        //1.yol:

        float corapFiyati = 12.99f;
        float gomlekFiyati = 25.99f;
        System.out.println("Toplam fiyat : " + (corapFiyati + gomlekFiyati)); //Toplam fiyat : 38.98

        //2.yol:

        float corapFiyati2 = 12.99f, gomlekFiyati2 = 23.99f;
        System.out.println("Fiyat : " + (3*corapFiyati2 + 2*gomlekFiyati2)); //Fiyat : 86.95
        //-----------------------------
        //6- double data type :
        //double memory de 8 byte (64 bit) yer kaplar, ondalikli kisim icin daha fazla rakam alir.
        // Ondalikli sayilar icin kullanilir. Daha hassas hesaplamalar icin kullanilir.

        //Ornek 1: Hucre agirligi icin bir variable olusturup console’a yazdiriniz
        double hucreAgirligi = 0.00000000000000000028;
        System.out.println(hucreAgirligi); //2.8E-19 ==> 2.8 carpi 10 uzeri -19 demektir

        //-----------------------------
        //7- char 2 byte’tir (16 bit). Tek karakterler icin kullanilir.
        // Sayi, sembol,harf farketmez. Data tek tirnak icine yazilir.
        // SD seklinde iki karakter koyamazsiniz.
        // Ornegin 'A', 'x', '?', '5' koyabilirsiniz

        //Ornek 1 : char data tipinde ismi isminIlkHarfi olan bir variable olusturunuz
        // ve icine tek bir karakter yukleyiniz

        char isminIlkHarfi = 'S';
        System.out.println(isminIlkHarfi); //S
        //-----------------------------
        //8- Boolean Data Type: Sadece true (dogru) ve false (yanlis) olmak uzere 2 farkli deger alirlar

        //Ornek 1 : boolean data tipinde emekli mi? Sorusu icin bir degisken olusturun ve false atayin.

        boolean isRetired = false;
        System.out.println(isRetired); //false

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("------------------");
        System.out.println(b1 && b2); //false
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); //false
        System.out.println(b3 || b4); //true

        System.out.println("-------------------");
        /*System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
        System.out.println()'in bir satır atlayarak çıktı vermesi,
        System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir*/

        System.out.println("Merhaba");
        System.out.println("Dunya");
        //Merhaba
        //Dunya

        System.out.print("Merhaba ");
        System.out.print("Dunya");
        //Merhaba Dunya

    }
}
