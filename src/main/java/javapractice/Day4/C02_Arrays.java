package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {

        /*

                - 3 elemanlı bir int array oluşturunuz
                - Array'in elemanlarını, sırası ile kullanıcıdan alınız
                - Array'deki elemanların ortalamasını bulunuz, yazdırınız
                - Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız

         */

        // - 3 elemanlı bir int array oluşturunuz
        int[] arr = new int[3];

        // - Array'in elemanlarını, sırası ile kullanıcıdan alınız
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<arr.length; i++){

            System.out.println("Sayi giriniz:");
            int sayi = scan.nextInt();

            arr[i] = sayi;

        }
        System.out.println(Arrays.toString(arr));

        // - Array'deki elemanların ortalamasını bulunuz, yazdırınız
        // ortalama = toplam/eleman sayisi
        double toplam = 0;

        for (int w : arr){
            toplam += w; // toplam = toplam + w
        }

        double ortalama = toplam/arr.length;
        System.out.println("Ortalama: "+ortalama);

        for (int w : arr){
            if (w > ortalama){
                System.out.println(w);
            }
        }

    }
}
