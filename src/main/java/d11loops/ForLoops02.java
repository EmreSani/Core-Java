package d11loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                        Day: 1
                        Day: 2
                        Day: 3
                        .....
                    Week: 2
                        Day: 1
                        Day: 2
                        Day: 3

                        ....    */

        for (int i = 1; i < 3; i++) { //Bir ayda 4 hafta icin yazdik
            System.out.println("Week : " + i);

            for (int j = 1; j < 3; j++) { //7 gun icin yazdik
                System.out.println("    Day: " + j);
            }
        }

        //-------------------------------
        System.out.println("------------------");

        /* Ornek 2:
        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

              X X X X X
              X X X X X
              X X X X X    */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        //int satir = 2;
        //int sutun = 2;

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print("X ");
            }
            System.out.println(); //pointer'i alt satira almak icin kullanildi
        }

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */

    }
}
