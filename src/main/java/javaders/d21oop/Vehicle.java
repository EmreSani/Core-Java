package d21oop;

public class Vehicle {

    //Java'da, bir sınıf için herhangi bir constructor açıkça tanımlanmamışsa,
    // Java derleyicisi o sınıfa ait varsayılan bir constructor ekler.
    // Bu varsayılan constructor parametresizdir ve class’in kendisine aittir,
    // Object class içinde tanımlı değildir. Ancak, tüm class’lar doğrudan ya da dolaylı olarak
    // Object class’indan miras alır ve Object sınıfındaki temel metodlara erişebilir.
    //(örneğin, toString(), equals(), hashCode() vb.).

    //Constructor Hiyerarsisi
    /*
    Child class’tan bir object olusturdugunuzda constructor’lar en ustteki parent class’tan
    baslatilarak alta doğru calistirilir
    */

    /*
    Soru: Peki child bir class’ta Object olusturuldugunda, Parent bunu nasil algiliyor da
    kendi constructor’unu calistiriyor?

    Cevap: Super() cagrisi ile yapilir. Super çağrısı, bir child class'ın constructor'unda,
    parent class’in parametresiz constructor'unu çağırmak için kullanılan bir ifadedir.

    super() çağrısı, bir child class'ta bir object oluşturulduğunda, otomatik olarak çağrılır.

    Ancak, super() çağrısını manuel olarak da çağırabilirsiniz.
    Bunu yapmak için, super() ifadesini, child class'ın constructor'unun başında kullanabilirsiniz.
    ****Manuel olarak yazarsaniz parametreli constructor’lari da cagirabilirsiniz.

    Neden super cagrisi yapalim?

    1- super keyword’unu kullanirsaniz, hem parent class’in methodunu çağırabilir hem de bu
    methodun davranışını child class’in ihtiyacına göre değiştirebilirsiniz.

    2 - extends ise sadece miras almayı sağlar, ancak parent class’in methodlarını değiştirmez.
    */

    //Ayni class’taki constructor’lar arasinda gezinmek icin super() silinir ve this() keyword’u kullanilir.
    // this() default olarak parametresiz constructor’i secer.
    //
    //this() ve super() her zaman ilk satirda olmalidir.
    //Bu yuzden bir constructor’da ikisi bir arada kullanilamazlar.
    //------------------------
    /*Soru : super() keyword’u kullanilarak parent class’taki constructor’lar degil de, variable’lar ve methodlar secilebilir mi?  Evet.

    Cevap : child’da bir constructor icinde, super yazip parantez koymadan, nokta koyup parent’taki variable veya methodlara ulasabiliriz */


    public Vehicle(){ //5
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }

}
