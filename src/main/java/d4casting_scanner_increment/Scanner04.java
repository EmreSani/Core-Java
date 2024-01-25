package d4casting_scanner_increment;

import java.util.Scanner;


public class Scanner04 {
    public static void main(String[] args) {
        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar

        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        //    int negatif = -5
        //    int pozitif = Math.abs(negatif);

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        float shortSide = input.nextFloat();
        float shortSidePozitif = Math.abs(shortSide);
        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();
        float longSidePozitif = Math.abs(longSide);

        System.out.println("Alan : " + (shortSidePozitif * longSidePozitif));
        System.out.println("Cevre : " + (2 * shortSidePozitif + 2 * longSidePozitif));

        //ODEV: Kisa kenar uzun kenar kontrolunu while dongusu ile yapiniz


    }
}
