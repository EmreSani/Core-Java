package javaders.d24collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {

        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java’da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler */

        //Hash kodu gormek istersek;

        String a = "aliye canan";
        System.out.println(a.hashCode()); //-916486578 //2117369223

        /*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set’tir.*/

        //HashSet nasil olusturulur?
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs); //[] //icinde hiclik var, null yok

        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]

        hs.add("Kerem"); //tekrarli eleman hata vermez, tekrarli elemanin uzerine yazar
        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]

        hs.add(null); //HashSet'e null ekleyebilirsiniz
        System.out.println(hs); //[Kerem, null, Sinan, Tuba, Onur]

        //------------------------Set'e eleman eklemenin kisa yolu

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Ali","Veli"));
        System.out.println(hs2); //[Veli, Ali]

        Set<String> hs3 = Set.of("Ayse","Fatma");
        System.out.println(hs3); //[Ayse, Fatma]

        //-------------------------
        //LinkedHashSet nasil olusturulur?
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        //LinkedHashSet'e eleman nasil eklenir?
        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs); //[14, 19, 7, 1, null] - insertion order - ekleme sirasi

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls); //[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls); //degisiklige ugrayan methodun solundakidir
        System.out.println(lhs); //[14, 19]
        System.out.println(ls); //[14, 19, 17, 11]

        //TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); //null koyamazsiniz cunku null olsa dogal siralama olamazdi
        System.out.println(ts); //[A, G, R, U, Z]

        //Siralama oldguundan ilk eleman son elemani kullanmak icin methodlar var

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('R'));  //G==> Verilen eleman olan R'den bir önceki eleman olan G'yi verir.
        System.out.println(ts.lower('D'));  //A==>  verir listede olmasada bir öncekini verir.
        System.out.println(ts.lower('A'));   //null verir.

        System.out.println(ts.higher('K')); //R ==> Verilen K den sonraki elemani verir.

        System.out.println(ts.headSet('R'));  //[A,G]==>R den öncekileri set olarak verir. Parantez icindeki dahil degil!!
        System.out.println(ts.headSet('R',true)); //[A,G,R]  Bu sekildeki parantez icindekini de dahil eder.

        System.out.println(ts.tailSet('G')); //[G,R,U,Z] ==> Parentez icindeki G dahildir.
        System.out.println(ts.tailSet('G',false)); // [R,U,Z] ==> Parantez icindkei bu sekilde dahil olmaz !!

        System.out.println(ts.ceiling('R'));  //ceiling ; cati ==> R ==>  Eleman set'in icinde varsa elemanin kendini return eder.
        System.out.println(ts.ceiling('K'));  // R==>  Eleman set'in icinde yoksa sonraki eleman return eder.
        //higher() methodundan farki kendisini de veriyor olmasi
        System.out.println(ts.floor('G')); //G ==> Eleman set'in icinde varsa elemanin kendisini return eder.
        System.out.println(ts.floor('J')); //G ==> Eleman set'in icinde yoksa önceki elemani return eder.

        System.out.println(ts.subSet('G','Z'));  //[G,R,U] ==> Ilk parametre dahil ikinic parametre haric
        System.out.println(ts.subSet('G','U'));  //U'dan sonraki herhnagi bir eleman da yazilabilir.
        System.out.println(ts.subSet('G',false,'Z',true));  // [R,U,Z]
        //ilkini haric ikincisini dahil yaptik

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        //TreeSet<Character> ss = ts.subSet('G', 'U'); HATA

        SortedSet<Character> ss = ts.subSet('G', 'U');
        System.out.println(ss); //[G, R] //substring gibi, ilki dahil, ikincisi haric

        SortedSet<Character> ss1 = ts.subSet('B', 'H');
        System.out.println(ss1); //[G]

    }
}
