package javaders.d22oop;

public abstract class Honda { //HATA: public final abstract class Honda, child'i olmaz

        /*
        4- Abstraction(Soyut)
        Abstraction iki bolumden olusur.
        i) Abstract Class:
        Kendisinden object olusturulmaz. Bazi class’lari obje olusturmak amaciyla degil,
        objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
        Baslangic degil, sonuctur.
        */

        /*
       1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.

       2)Body'si olan method'lara 'non-abstract' veya ‘concrete' (somut) method denir

       3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.

       4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.

       5)Abstract class'lar hem 'abstract method' hem de 'concrete method’ icerebilirler.

       6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
    */
    //7) Final methodlar override edilemedigi icin, abstract olamazlar.(***”final” bir access modifier değildir.
    // "final," bir Java anahtar kelimesidir)

    //8) Abstract bir class’in abstract bir child’i olabilir ve abstract child parent’inin methodlarini
    // override etmek zorunda degildir ama isterse de edebilir

    //9) Abstract bir class private olamaz yoksa child’lari ona ulasip override edemez


    public void music(){
        System.out.println("Pro");
    }

    public abstract void engine(); //HATA: public final abstract void engine(), override edilemez

}
