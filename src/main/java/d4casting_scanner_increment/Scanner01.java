package d4casting_scanner_increment;

//import java.util.Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Java’da Scanner class’i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.
        //Scanner sınıfı, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        //next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar

        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz

        //1.adim: Scanner class'tan object olusutur
        //System.in klavye uzerinden veri okumak icin kullanilir.
        Scanner giris = new Scanner(System.in);

        //2.adim: Kullaniciya ne istediginize dair mesaj verin
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim: Uygun methodu kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        byte age = giris.nextByte();
        //Kullanicinin girdigi veriyi yerel age degiskenine yukledik
        System.out.println(age);

    }
}
