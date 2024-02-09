package Day4;

import java.util.Scanner;

public class C01_SayiUcgeni {
    public static void main(String[] args) {

        /*

                - Kullanıcıdan bir satır sayısı girdisi isteyin.
                - Verilen girdiye göre, aşağıdaki üçgeni oluşturun:
                    Örn: 4
                    1
                    2 3
                    4 5 6
                    7 8 9 10

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz:");
        int satir = input.nextInt();

        int sayi = 1;

        for (int i=1; i<=satir; i++){

            for (int j=1; j<=i; j++){
                System.out.print(sayi+" ");
                sayi++;
            }
            System.out.println();

        }


        System.out.println("----------------------------------------------------");
        /*
                1 2 3 4
                5 6 7
                8 9
                10
         */
        /*

                %d: digit (tamsayi)
                %3d: 3 digit'lik karakter sınırı
                %-3d: Sola yaslar

         */

        sayi = 1;

        for (int i=satir; i>=1; i--){

            for (int j=1; j<=i; j++){

                //System.out.print(sayi+" ");
                System.out.printf("%-3d", sayi);
                sayi++;

            }
            System.out.println();

        }


    }
}
