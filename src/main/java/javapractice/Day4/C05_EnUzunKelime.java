package Day4;

import java.lang.invoke.StringConcatFactory;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        /*

                Kullanıcıdan alınan cümledeki en uzun kelimeyi yazdiran bir kod yazınız.

                Ornek: "kullanicidan alinan cumle"

         */

        String cumle = "kullanicidan alinan............... cumle";

        cumle = cumle.replaceAll("[.,?]", "");

        String[] kelimeler = cumle.split(" "); // [ "kullanicidan", "alinan", "cumle" ]

        String longestWord = "";

        for(String w : kelimeler){
            if(w.length()>longestWord.length()){
                longestWord = w;
            }
        }
        System.out.println(longestWord);


    }
}
