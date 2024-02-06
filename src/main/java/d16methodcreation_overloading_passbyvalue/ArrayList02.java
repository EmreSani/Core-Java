package d16methodcreation_overloading_passbyvalue;

import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Bir List olusturmak icin kisa yol

        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
        System.out.println(myList); //[1, 3, 4, 9, 7]

        //asList() methodu kullanarak kisa yoldan List olusturabiliriz ama bunu kullanmanin bazi
        //handikaplari vardir. List'imiz arka planda Array gibi calismaya baslar.
        //Yani List'in eleman sayisini degistiren methodlari kullanamazsiniz.

        //myList.remove(0); //HATA
        //myList.add(5); //HATA
        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.
        //myList.clear(); //HATA

        myList.set(0, 5);
        System.out.println(myList); //[5, 3, 4, 9, 7]
        System.out.println(myList.size()); //5

    }
}
