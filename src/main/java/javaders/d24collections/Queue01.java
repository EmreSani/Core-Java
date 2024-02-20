package d24collections;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {

        /* Java’da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
        Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
        Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

        İşte gerçek dünyadan birkaç örnek:
     Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
         bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
         İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
     Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
         Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
     Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
         İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
     Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
         Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

    Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
    Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

    Queue interface’i, LinkedList ve PriorityQueue gibi farklı sınıflar tarafından uygulanabilir. */

        //Queue nasil olusturulur?

        Queue<String> depo = new LinkedList<>();
        //Queue'ya nasil eleman eklenir?
        //1)add(): Belirtilen öğeyi kuyruğa ekler.

        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo); //[sut, et, yumurta, peynir] - insertion order

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
        // Kuyruk boşsa bir istisna fırlatır.
        String s = depo.remove();
        System.out.println(s); //sut
        System.out.println(depo); //[et, yumurta, peynir]

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        System.out.println(depo.peek()); //et
        System.out.println(depo); //[et, yumurta, peynir]

        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
        //System.out.println(depo.clear()); //HATA
        depo.clear();
        System.out.println(depo); //[]

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
        System.out.println(depo.poll()); //null

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
        //System.out.println(depo.element()); HATA

        //-------------------------
        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

                //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //---------------PriorityQueue nasil olusturulur?

        PriorityQueue<String> acilSirasi = new PriorityQueue<>();

        //PriorityQueue'ya nasil eleman eklenir?
        //add(): Belirtilen öğeyi kuyruğa ekler.

        acilSirasi.add("Mehmet");
        acilSirasi.add("Mahmut");
        acilSirasi.add("Ekrem");
        acilSirasi.add("Oya");
        acilSirasi.add("Tansu");
        System.out.println(acilSirasi); //[Ekrem, Mehmet, Mahmut, Oya, Tansu]

        //-------------------------
        //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
        // ve çıkartmaya izin veren bir veri yapısıdır.
        // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //Gündelik hayatta kullanılabilecek bazı Deque örnekleri:

        //1) İnternet Tarayıcıları: İnternet tarayıcıları, kullanıcıların web sayfalarını gezdikçe
        // birçok sayfayı bir araya getirir. Bu sayfaları tarayıcı geçmişi adı verilen bir veri
        // yapısında saklar. Kullanıcılar geri ve ileri tuşlarına bastığında, bu geçmişteki sayfalar
        // Deque mantığıyla işlenir. Kullanıcı son ziyaret ettiği sayfadan geri gitmek istediğinde
        // veya ileri gitmek istediğinde Deque yapısı kullanılır.

        //2) Geri Al/Yeniden Uygula: Çoğu yazılım uygulaması, kullanıcıların yaptıkları işlemleri geri
        // almasına ve tekrar uygulamasına olanak tanır. Örneğin, metin düzenleyicilerde bir yazıyı
        // yazdıktan sonra geri al (command + z) tuşuna bastığınızda, son yapılan işlem geri alınır.
        // Bu işlemi uygulamak için bir Deque kullanabilirsiniz.

        //---------------Deque nasil olusturulur?

        Deque<String> d = new LinkedList<>(); //Deque<String> e = new ArrayDeque<>(); de olabilirdi

        //Deque’e nasil eleman eklenir?
        //add(): Belirtilen öğeyi ekler.

        d.add("Mehmet");
        d.add("Mahmut");
        d.add("Ekrem");
        d.add("Oya");
        d.add("Tansu");
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu]

        //1) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez.

        d.addFirst("Ali");
        System.out.println(d); //[Ali, Mehmet, Mahmut, Ekrem, Oya, Tansu]

        for (String w : d){ //Ayri satirlarda elemanlari yazdiralim
            System.out.println(w);
        }

        System.out.println("---------------------");

        //2) addLast(E e): Deque'nin sonuna bir öğe ekler. Dönüş türü yine void'dir.
        d.addLast("Hasan");

        for (String w : d){
            System.out.println(w);
        }

        System.out.println("---------------------");

        //3)removeFirst(): Deque'nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)

        System.out.println(d.removeFirst()); //Ali
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu, Hasan]

        //ArrayDeque Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder
        // (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
        // Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
        // ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
        // bir yapı kullanır. ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.

        //ArrayDeque Nasıl Oluşturulur?

        ArrayDeque<String> ad = new ArrayDeque<>();

        //Eleman Nasıl Eklenir?

        // Baştan Ekleme: addFirst()
        // Sondan Ekleme: addLast()

        ad.addFirst("ilk");
        System.out.println(ad); //[ilk]

        ad.addLast("son");
        System.out.println(ad); //[ilk, son]

        //Eleman Çıkarma:
        //removeFirst(): Kuyruğun başından bir eleman çıkarır.
        //removeLast(): Kuyruğun sonundan bir eleman çıkarır.

        String ilk = ad.removeFirst();
        System.out.println(ilk); //ilk
        System.out.println(ad); //[son]

        String son = ad.removeLast();
        System.out.println(son); //son
        System.out.println(ad); //[]

    }
}
