package d13arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?
        // =‘den sonra {} acar, degerleri yazariz

        int[] numbers = {12, 3, -3, 5, 23};
        System.out.println(Arrays.toString(numbers)); //[12, 3, -3, 5, 23]

        //[12, 3, -3, 5, 23]
        for (int w : numbers) {

            if (w < 5) {
                System.out.print(w + " "); //3 -3
            }
        }

        //---------------------
        System.out.println();
        //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

        /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
         */

        String names[] = {"A", "T", "K", "E", "B"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //[A, B, E, K, T]

        int result = Arrays.binarySearch(names, "B");
        System.out.println(result); //1, C'de -3 verdi. - yok demek. 3 olsaydi, hangi sirada olacagi bilgisi

        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 6, 7]

        System.out.println(Arrays.binarySearch(arr, 2)); //1.index'te var
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 3)); //-3
        System.out.println(Arrays.binarySearch(arr, 9)); //-5

        String[] str = {"A", "C", "B", "D"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[A, B, C, D]

        System.out.println(Arrays.binarySearch(str, "A")); //0
        System.out.println(Arrays.binarySearch(str, "C")); //2
        System.out.println(Arrays.binarySearch(str, "E")); //-5
        System.out.println(Arrays.binarySearch(str, "G")); //-5

        //--------------------
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //String s = "Java is easy. Learn Java earn money.”;

        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s); //Java is easy. Learn Java earn money.

        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length); //7


    }
}
