package Day3;

import java.util.Scanner;

public class C02_ForLoops {

    public static void main(String[] args) {

            /*

                    Kullanıcıdan 5 adet sayı girmesini isteyin.

                    Bu sayılardan, birler basamağı 7 veya 9 olanlar hariç, sayıların toplamını yazdırın.

                    1
                    25
                    92
                    12
                    71

            */

        Scanner input = new Scanner(System.in);

        int toplam = 0;


        for (int i=0; i<5; i++){

            System.out.println("Bir sayı giriniz:");
            int sayi = input.nextInt();

            if (sayi%10==7 || sayi%10==9){
                continue; // Loop'u atla
            }

            toplam = toplam + sayi; // toplam += sayi

        }

        /*
        for (int i=0; i<5; i++){

            System.out.println("Bir sayı giriniz:");
            int sayi = input.nextInt();

            // 1. Farklı Yol
            if ( !(sayi%10==7 && sayi%10==9) ){
                toplam = toplam + sayi; // toplam += sayi
            }

            // 2. Farklı Yol
            if ( sayi%10 !=7 && sayi%10 != 9 ){
                toplam = toplam + sayi; // toplam += sayi
            }

        }
         */

        System.out.println("Toplam: "+toplam);

    }



}
