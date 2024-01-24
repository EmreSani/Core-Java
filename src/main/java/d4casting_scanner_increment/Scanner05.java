package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int num = input.nextInt();

        int ilkIki = num / 1000;

        int sonIki = num % 100;

        System.out.println(ilkIki + sonIki);

    }
}
