package d4casting_scanner_increment;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Lutfen iki sayi giriniz");

        double firstNumber = input.nextDouble(); //command + D, control + D
        double secondNumber = input.nextDouble();

        System.out.println("Toplam : " + (firstNumber + secondNumber));
        System.out.println("Fark : " + (firstNumber - secondNumber));
        System.out.println("Carpim : " + (firstNumber * secondNumber));
        System.out.println("Bolum : " + String.format("%.3f",(firstNumber / secondNumber)));

    }
}
