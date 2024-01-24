package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta
        ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunIsmi = input.next();

        //equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
        //Bu method boolean return eder.(true veya false)

        //equalsIgnoreCase() iki String'in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");


        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIci) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }


    }
}
