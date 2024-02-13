package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat(); //Dogs eat...
        d.bark(); //Dogs bark...
        d.feedWithMilk(); //Mammals feed their babies with milk
        d.drink(); //Animals drink... //Dogs drink

        //Bird class'tan object uretelim
        Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.drink(); //Animals drink...
        b.eat(); //Animals eat...

        Cat c = new Cat();
        c.feedWithMilk(); //Cats feed their babies with milk

        //a) Java ‘Multiple Inheritance' i desteklemez. ‘Single Inheritance’ i destekler.
        //----------------------------
        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //   'Hierarchical Inheritance' denir ve Java bunu kabul eder.
        //----------------------------
        /*c) Ama coklu parent’lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz
        class’lar birden fazla ise (parent’lar) o durumda Java bize, Apartman tarzi yapilanma olusturmustur.
        ('Multi Level Inheritance’) Java bunu kabul eder.*/
        //----------------------------
        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)
        //----------------------------
        //Java'da, bir sınıf için herhangi bir constructor açıkça tanımlanmamışsa,
        // Java derleyicisi o sınıfa ait varsayılan bir constructor ekler.
        // Bu varsayılan constructor parametresizdir ve class’in kendisine aittir,
        // Object class içinde tanımlı değildir. Ancak, tüm class’lar doğrudan ya da dolaylı olarak
        // Object class’indan miras alır ve Object sınıfındaki temel metodlara erişebilir.
        //(örneğin, toString(), equals(), hashCode() vb.).

    }
}
