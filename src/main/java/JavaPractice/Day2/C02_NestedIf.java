package JavaPractice.Day2;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {

        /*

                1. Kullanıcıdan bir sayı girmesini isteyin.
                    - Numara sıfırdan küçük ise, konsola "Negatif" yazdırın.
                    - Numara sıfırdan büyük ise,
                        + Numara 10'dan küçük ise konsola "Rakam" yazdırın.
                        + Numara 10'dan büyük ise konsola "Pozitif Sayı" yazdırın.

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif");
        } else if (sayi == 0) {
            System.out.println("Sıfır");
        } else { // Numara sıfırdan büyük ise

            if (sayi < 10) {
                System.out.println("Rakam");
            } else {
                System.out.println("Pozitif Sayı");
            }

        }
    input.close();
    }
}