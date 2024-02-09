package Day2;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*

                1. Kullanıcıdan iki sayı alın.
                2. Ternary kullanarak,
                    - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
                    - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();

        Object result = sayi1==sayi2 ? ("Sayılar biririne eşit") : (sayi1>sayi2 ? sayi1*sayi1 : sayi2*sayi2);

        System.out.println(result);

    }
}
