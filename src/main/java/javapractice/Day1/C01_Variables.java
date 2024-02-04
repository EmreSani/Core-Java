package Day1;

public class C01_Variables {

    // psvm / main
    public static void main(String[] args) {

        // Bir yas variable'i olustur, ve yazdir
        byte age = 20;
        System.out.println("Yas: " + age);

        // Bir sayi olustur, ve yazdir
        int number = 12345;
        System.out.println(number); // number.sout
        System.out.println("number = " + number); // number.soutv

        /*

                1. Yeni bir myAge variable'i olustur
                2. Mevcut age variable'inin degerini, myAge'e ata.

         */
        byte myAge = age;
        System.out.println("myAge = " + myAge);

        // Bir isim variable'i olustur ve yazdir
        String name = "Ali";
        System.out.println("name = " + name);

        /*

                1. myName isimli bir variable olustur.
                2. Mevcut name degiskeninin degerini, myName'e ata

         */
        String myName = name;
        System.out.println("myName = " + myName);

        // Name bilgisini guncelle
        name = "Mehmet";
        System.out.println("name = " + name);
        System.out.println("myName = " + myName);

        myName = name;

    }

}
