package Day3;

import java.util.Scanner;

public class C05_DoWhileLoops {
    public static void main(String[] args) {

        /*

                - Kullanıcıdan pozitif sayı girdileri isteyin.

                - Kullanıcı 0 sayısını girdiğinde işlemi durdurun.

                - İşlem durduğunda, kaç adet pozitif sayı girildiğini ve pozitif sayıların toplamını yazdırın.

                - Negatif sayı girilirse, bunun mümkün olmadığını yazdırın.

         */

        Scanner input = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        do{

            System.out.println("Bir sayı giriniz. (İşlemi sonlandırmak için 0'a basınız.)");
            int sayi = input.nextInt();

            if (sayi == 0){
                break;
            }else if (sayi < 0){
                System.out.println("Negatif sayı giremezsiniz.");
            }else{
                sayac++;
                toplam += sayi; // toplam = toplam = sayi
            }

        }while (true);

        System.out.println("Girilen "+sayac+" sayının toplamı: "+toplam);



    }
}
