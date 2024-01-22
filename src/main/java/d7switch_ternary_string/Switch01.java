package d7switch_ternary_string;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.

8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
*/

        /*
Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz

       switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz
 */
    Scanner input = new Scanner(System.in);
    System.out.println("Baslangic ay numarasini giriniz");
    int aySayisi = input.nextInt();

    switch (aySayisi){
        case 1:
            System.out.println("Ocak");
        case 2:
            System.out.println("Subat");
        case 3:
            System.out.println("Mart");
        case 4:
            System.out.println("Nisan");
        case 5:
            System.out.println("Mayis");
        case 6:
            System.out.println("Haziran");
        case 7:
            System.out.println("Temmuz");
        case 8:
            System.out.println("Agustos");
        case 9:
            System.out.println("Eylul");
        case 10:
            System.out.println("Ekim");
        case 11:
            System.out.println("Kasim");
        case 12:
            System.out.println("Aralik");
            break;
        default:
            System.out.println("Gecerli bir ay numarasi girmediniz.");




    }

    input.close();




    }
}
