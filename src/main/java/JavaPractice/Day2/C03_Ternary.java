package JavaPractice.Day2;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num = input.nextInt();

        //first
       Object sonuc = num%2 == 0 ? ("Cift sayi"):(num+3);
        System.out.println(sonuc);

        //second
        System.out.println(num%2==0? "Cift sayi" : num+3);






    }
}
