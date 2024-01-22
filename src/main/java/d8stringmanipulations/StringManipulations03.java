package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        //ii)Space karakteri password'de olmasin
        //space haric herseyi silelim, 0 tane mi diye bakalim

        boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty(); //length()==0'de yazabilirdik
        //System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun(buyuk harf haric herseyi silelim)

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("digitControl = " + digitControl);

        //ODEV: En az 1 tane sembol icermeli
        boolean symbolControl = pwd.replaceAll("\\p{Punct}","").length() > 0;
        System.out.println("symbolControl = " + symbolControl);

        if (!digitControl){
            System.out.println("Sifre an az bir rakam icermelidir");
        }

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl;

        if (isValid){
            System.out.println("Sifre gecerlidir");
        }else {
            System.out.println("Sifre gecersizdir");
        }

    }
}