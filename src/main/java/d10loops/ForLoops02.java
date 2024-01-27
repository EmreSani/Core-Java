package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz
        //           578 ==> 5+7+8=20 ==> Output 20 olmali

        //Iki int'i birbirine bolersek sonuc int olur (tamsayi).
        //Java virgulden sonrasini siler, yuvarlama islemi yapmaz.

        //ornegin: 578/10=57
        //Azaltma islemi 10’a bolme yoluyla yapilacak

        int sum = 0;

        for (int i = 578; i > 0; i = i / 10) { // i /= 10 de yazabilirdik

            sum = sum + i % 10;

        }
        System.out.println("sum = " + sum);

        //-------------------------------
        //Ornek 2: Bir String'teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = "";

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i); //index verecegiz, harfi bize verecek

            if (t.indexOf(ch) == t.lastIndexOf(ch)){
                unique = unique + ch;
            }

        }
        System.out.println("Tekrarsiz : " + unique); //Tekrarsiz : Ysf


    }
}