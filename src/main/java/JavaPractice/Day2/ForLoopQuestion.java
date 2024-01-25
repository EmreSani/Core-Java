package JavaPractice.Day2;

import java.util.Scanner;

public class ForLoopQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                toplam = toplam + i;

            }
            System.out.println(toplam);
        } else {
            for (int i = bas; i >= bit; i--) {
                carpim = carpim * i;

            }
            System.out.print(carpim);
        }
        scan.close();
    }
}

