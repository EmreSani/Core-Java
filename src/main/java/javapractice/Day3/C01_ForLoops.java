package Day3;

import java.util.Scanner;

public class C01_ForLoops {

    public static void main(String[] args) {

        /*
                Kullanıcıdan bir kelime girdisi isteyin.

                Kelimede, c harfine rastlanana kadar a harflerinin sayısını yazdırınız.

                aaaaabaacaaaa
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz.");

        String kelime = scan.next();

        // aaabaca

        int sayi = 0;

        for (int i=0; i<kelime.length(); i++){

            if (kelime.charAt(i) == 'c'){
                break;
            }

            if (kelime.charAt(i) == 'a'){
                sayi++;
            }

        }

        System.out.println(sayi);

    }

}
