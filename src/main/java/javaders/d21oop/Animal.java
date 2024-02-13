package d21oop;

public class Animal { //public final class Animal yazarsak Animal'in child'i olmaz

    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama)
    //Gerçek hayatta gördüğümüz birçok Object'in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
    //Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
    // ortamında gösterilmesi buna örnek olarak verilebilir.

    /*Object Yönelimli Programlamanın Faydaları:

    1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
    2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
    ile çalıştırılabilir. Substring() method’u 1 kere yazilmis ama surekli kullanabiliyoruz.
    3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
    4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
    5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class’ ta değişiklik
    yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

    /* OOP’leri 4 temel özellikte inceleyebiliriz.
    1. Inheritance - Miras Alma
    2. Polymorphism - Çok Biçimlilik
    3. Encapsulation - Kapsülleme
    4. Abstraction - Soyutlama
    */
    //--------------------------------------------
    //1.Inheritance (Miras)
    //OOP’nin dort temel ozelliginin 1.sidir.
    //Ozellikleri bir class'tan diğer class'lara alan bir kavramdır.

    //extends - uzanmak

    /*
    Inheritance’in Faydalari nelerdir?

    1) Kodun yeniden kullanılmasına yardımcı olur.
    2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
    emekten tasarruf sağlayabiliriz.
    3) Kolayca update yapabiliriz.
    4) Class’lari kuculturuz.
    5) Daha az geliştirme ve bakım maliyetine yol açar.
    */

    //-------------------
    //2.Polymorphism:
    //Method Overloading + Method Overriding

    //OOP'nin prensiplerinin 2.sidir. Polymorphism (cok bicimlilik) demektir.
    //Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.

    //iki cesidi var.

    // i.Method Overloading: Daha once gormustuk
    //ii.Method Overriding (gecersiz kilmak, agir basan)
    // Child class'in Parent'taki methodu degistirerek kullanmasidir.

    //@Override Anotasyonu:
    //Java'da bir methodu override ettiğinizde @Override anotasyonunu kullanmak zorunda değilsiniz;
    // ancak, bu anotasyon kodun okunabilirliğini artırır ve hataları önlemeye yardımcı olur.
    // Yani, bu anotasyonu kullanmak iyi bir uygulamadır ama zorunlu değildir.

    //--------------------
    //Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim

    //Soru1: private method'lar override edilebilir mi?
    //Cevap1: private method'lar override edilemezler (parent ‘eat’)cunku
    //override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
    //Ama private method'lar baska classlardan ulasilamaz methodlardir.

    //child’in access modifier’i parent’tan daha dar olamaz
    //Liskov'un yerine gecme prensibi

    //----------------------------
    //Soru2: static method'lar override edilebilir mi?
    //Cevap2: static method'lar override edilemezler cunku; static variable veya
    // method'lar tum objeler icin ortaktir. Java static method'larin override edilmesine musaade etmez.
    //----------------------------
    //Soru3: static method'lar overload edilebilir mi?
    //Cevap3: static method'lar overload edilebilir cunku esasinda overload'da
    // biz yeni method'lar olustururuz. ornegin; pi sayisini farkli bir method
    // icinde yine kullanabilirsiniz.
    //--------------------------
    /*Final keyword’u: Override’da ozel bir durum vardir:

    1- Java’da "final" anahtar kelimesi (keyword) ile işaretlenen bir method, alt class’lar tarafından override edilemez.
    2- Yani, bir class’in child’lari, final olarak işaretlenmiş bir methodu değiştiremez veya üzerine yazamaz.
    3- Bu method, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir.
    4- Final Variables, Final Classes, Final Parametreler’de olabilir.

    Sonuc: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama
    veya belirli davranışları zorlamada yardımcı olmak için kullanılır.*/


    public void eat(){
        System.out.println("Animals eat...");
        final double pi = 3.14;
        //pi = 3; //pi degiskeni final oldugu icin yeni deger atayamazsiniz
    }

    //1- Override isleminde access modifier’larin durumlarini
    // ogrendik. Simdi de return type durumlarina bakalim.

    public Animal create(){ //Data type Animal'dir //public final Animal create() yazdigimizda bu methodu override edemeyiz
        return new Animal(); //Animal urettik, disari Animal verdik
    }

    //2-Parent’ta int veri turunde bir method acip, child’da override
    // etseydik ne olurdu?

    public int add(int a, int b){
        return a + b;
    }

    //3-Peki Parent’ta Class veri turunde bir method acip,
    // child’da override etseydik ne olurdu?
    //Parent ve child data tipleri ayni olmali veya
    // Override'da parenttaki her zaman ust class olmalidir
    public Integer carpma(Integer a, Integer b){
        return a * b;
    }

    /*4-Return type void ise degisim olmaz. Hep void olarak kalir*/

    public void drink(){
        System.out.println("Animals drink...");
    }
}
