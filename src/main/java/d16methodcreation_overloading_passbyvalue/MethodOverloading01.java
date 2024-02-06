package d16methodcreation_overloading_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
        */

        //i.Method Overloading:

        //String s = "Java";
        //s.substring(int beginIndex) ==> tek parametre aliyor
        //s.substring(int beginIndex, int endIndex) ==> iki parametre aliyor

        /* Method Overloading'de sadece parametreler degistirilir.
           Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

        Method Overloading icin;
        a) Parametre sayisini degistirebilirsiniz.
        b) Parametre data tiplerini degistirebilirsiniz.
        c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        d)Method overloading olustururken return type’in, access modifier’in,
           static veya non-static olmanin hicbir etkisi yoktur.
        */

       decrease(5.0,3);
       add(5,3);
    } //main disi
    //ornek : Toplama islemi yapan bir method
    //olusturun ve sonra da overload edin
    public static void add(int a , int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a + b);
    }
    public static void add(int a, double b){
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a + b);
    }
    public static void decrease(int a, int b){
        System.out.println(a-b);
    }

    public static void decrease(double a, int b){
        System.out.println(a-b);
    }
    //Auto Widening - otomatik genisletme
    //Kucuk veri tipinden buyuk veri tipine cevirme.Java otomatik yapar.

    //Explicit Narrowing (Aciktan Daraltma)
    //Buyuk veri tipinden kucuk veri tipine cevirme.
    //Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar

    /*
    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
    */


}
