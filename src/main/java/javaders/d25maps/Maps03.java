package javaders.d25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali 1 kere gozuktu. Java digerini Ali. olarak algilar
        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); //ali nasilsin ali

        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();

        System.out.println(myMap); //{                                                 } //bos bir map

        //[ali, nasilsin, ali]
        for (String w : kelimeler) {

            Integer gorunum = myMap.get(w); //ilk dongu de, map'te ali olmadigindan value'su null gelecek

            if (gorunum == null) {
                myMap.put(w, 1); //map'te yoksa w'dan 1 tane koy
            } else {
                myMap.put(w, gorunum + 1);
            }
        }
        System.out.println(myMap); //{nasilsin=1, ali=2}

        //-------------------------ODEV:
        //ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //           “ Hello my name is Emre.! ” ==> H=1, e=1, l=2, o=1

        String str = " Hello my name is Emre.! ";
        String [] strArr = str.trim().replaceAll("\\p{Punct}", "").split("");
        System.out.println(Arrays.toString(strArr));
        HashMap <String , Integer> myHashMap = new HashMap<>();
        for (String w: strArr) {
           Integer mevcutlukDurumu = myHashMap.get(w);
           if (mevcutlukDurumu==null){
               myHashMap.put(w, 1);
           }else {
               myHashMap.put(w, mevcutlukDurumu+1);
           }
        }
        System.out.println(myHashMap);










    }
}
