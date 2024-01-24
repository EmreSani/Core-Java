package JavaPractice.Day2;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*

        1. Kullanıcıdan iki sayı alın.
        2. Ternary kullanarak,
            - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.

 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int x = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int y = scan.nextInt();

        Object result= x==y ? "sayilar birbirine esit" : ( x>y ? x*x : y*y );

        System.out.println(result);





    }
}
