package miniprojects.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // bilgisayara 50 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // kullanicinin 5 tahmin hakki olsun

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int rndSayi = rnd.nextInt(51) + 50;
        int girilenSayi;
        int tahminSayisi = 0;
        int kalanTahmin = 5;
        System.out.println(rndSayi);
        while (kalanTahmin>0) {
            System.out.println("Lutfen 50 ile 100 arasi sayi giriniz\n" + kalanTahmin + " tahmin hakkiniz var");
            girilenSayi = input.nextInt();
            tahminSayisi++;
            kalanTahmin--;
            if (girilenSayi == rndSayi) {
                System.out.println("tebrikler " + tahminSayisi + ". tahminde buldunuz");
                break;
            } else if (girilenSayi < rndSayi && kalanTahmin !=0) {
                System.out.println("Lutfen daha buyuk sayi giriniz");
            } else if (kalanTahmin!=0){
                System.out.println("Lutfen daha kucuk sayi giriniz");
            }
        } if (kalanTahmin==0){
            System.out.println("tahmin hakkınız kalmamistir lutfen tekrar deneyiniz");
        }
    }
}