package Day1;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve karesini ekrana yazdirin.
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi girin.");

        int sayi = scan.nextInt();

        System.out.println(sayi*sayi);


    }

}
