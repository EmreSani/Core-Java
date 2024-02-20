package d24collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        long t1 = System.nanoTime();

        //1.yol: Yavas - Cunku her elemanda siralama yapar.
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gamail.com");
        emails.add("a@gamail.com");
        emails.add("z@gamail.com");
        emails.add("l@gamail.com");
        emails.add("u@gamail.com");
        emails.add("p@gamail.com");
        emails.add("g@gamail.com");
        emails.add("b@gamail.com");
        emails.add("t@gamail.com");
        emails.add("x@gamail.com");
        System.out.println(emails); //[a@gamail.com, b@gamail.com, g@gamail.com, k@gamail.com, l@gamail.com,
        // p@gamail.com, t@gamail.com, u@gamail.com, x@gamail.com, z@gamail.com]

        long t2 = System.nanoTime();

        //Hizlandirmak icin eleman eklerken en hizli olandan(HashSet) yardim alalim
        //2.yol : Tavsiye edilir - Daha hizli

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gamail.com");
        emailsHs.add("a@gamail.com");
        emailsHs.add("z@gamail.com");
        emailsHs.add("l@gamail.com");
        emailsHs.add("u@gamail.com");
        emailsHs.add("p@gamail.com");
        emailsHs.add("g@gamail.com");
        emailsHs.add("b@gamail.com");
        emailsHs.add("t@gamail.com");
        emailsHs.add("x@gamail.com");
        System.out.println(emailsHs); //[k@gamail.com, l@gamail.com, x@gamail.com, p@gamail.com, u@gamail.com,
        // t@gamail.com, b@gamail.com, a@gamail.com, z@gamail.com, g@gamail.com]

        //Bos bir TreeSet olusturalim ve constructor'ina HashSet'i yazalim
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs); //[a@gamail.com, b@gamail.com, g@gamail.com, k@gamail.com, l@gamail.com,
        // p@gamail.com, t@gamail.com, u@gamail.com, x@gamail.com, z@gamail.com]

        long t3 = System.nanoTime();

        System.out.println(t2 - t1); //treeset - 729292
        System.out.println(t3 - t2); //hashset - 327333

    }
}
