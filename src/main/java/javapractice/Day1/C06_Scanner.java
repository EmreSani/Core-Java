package Day1;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan kilo ve boy bilgisini alin ve vucut kitle indeksini gosterin.
        // kilo/(boy*boy)
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz.");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz.");
        double boy = scan.nextDouble();


        // Vucut Kitle Indeksini Goster
        System.out.println(kilo/(boy*boy));

    }

}
