package d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String s = "Java is easy";

        String sub1 = s.substring(0,4);

        System.out.println(sub1); //Java

        //Ornek 4: “s” String’indeki “is” kelimesini aliniz.

        String sub2 = s.substring(5,7);

        System.out.println(sub2);//is

        //Ornek 5: “s” String’indeki “easy” kelimesini aliniz.

        String sub3 = s.substring(8,12);
        System.out.println(sub3); //easy

        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna kadar olan substring’i döndürür.

            String sub4 = s.substring(8);
        System.out.println(sub4);

        //Ornek 6: “s” String’inde easy kelimesinin var olup olmadigini kontrol ediniz.
//contains() method’u herhangi bir karakterin veya karakterlerin String’de var olup olmadigini kontrol eder.
//contains() methodu true veya false return eder. boolean

        boolean isExist = s.contains("easy");
        System.out.println(isExist);




    }
}
