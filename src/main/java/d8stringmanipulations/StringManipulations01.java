package d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String s = "Java is easy";

        String sub1 = s.substring(0, 4);
        System.out.println(sub1); //Java

        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.

        String sub2 = s.substring(5, 7);
        System.out.println(sub2); //is

        //Ornek 5: "s" String'indeki "easy" kelimesini aliniz.

        String sub3 = s.substring(8, 12);
        System.out.println(sub3); //easy

        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak
        // sonuna kadar olan substring'i döndürür.

        String sub4 = s.substring(8);
        System.out.println(sub4); //easy

        //Ornek 6: "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //contains() method'u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean

        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        //Ornek 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //startsWith() methodu bir Strig'in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); //Java

        //Ornek 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        //endsWith() methodu bir Strig'in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd); //true


    }
}