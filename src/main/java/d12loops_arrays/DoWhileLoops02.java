package d12loops_arrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.

       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
        */

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {

            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Lutfen Username'i giriniz");
            String userName = input.next();

            System.out.println("Lutfen Password'u giriniz");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hos geldiniz");
                break;
            }
            counter++;

        } while (true); //sonsuz dongu. Icerden kirilmadigi surece calisacak


    }
}
