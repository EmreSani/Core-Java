package JavaPractice.Day2;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan iki sayı isteyin,
            - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
            - İkisi de negatif ise sayıların çarpımını yazdırın.
            - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
            - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();


        if (sayi1>0 && sayi2>0 ){
            System.out.println(sayi1+sayi2);

        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);

        } else if (sayi1*sayi2<0 ){
            System.out.println("bu sayilarla islem yapilamiyor");
        } else {
            System.out.println("yutan eleman");
        }

    }
}
