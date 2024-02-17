package miniprojects.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız
         */
        Scanner scan=new Scanner(System.in);
        char operator;

        do {
            System.out.println("lutfen islem yapmak icin +,-,*,/,%,^ islemlerinden birini seciniz siz c tusuna basana kadar islem yapmaya devam edicek");
            operator=scan.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin toplami : "+(scan.nextDouble()+ scan.nextDouble()));
                    break;
                case '-':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin farki : "+(scan.nextDouble()- scan.nextDouble()));
                    break;
                case '*':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin carpimi : "+(scan.nextDouble()* scan.nextDouble()));
                    break;
                case '/':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    double pay = scan.nextInt();
                    double payda = scan.nextInt();
                    if (payda==0){
                        System.out.println("Hata: payda 0 olamaz.");
                    } else {
                        System.out.println("sayilarin bolumu: "+ pay/payda);
                    }
                    break;
                case '%':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    double modPay = scan.nextInt();
                    double modPayda = scan.nextInt();
                    if (modPayda==0){
                        System.out.println("Hata: payda 0 olamaz.");
                    } else {
                        System.out.println("sayilarin bolumunden kalan: "+ modPay%modPayda);
                    }
                    break;
                case '^':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin kuvveti : "+Math.pow(scan.nextDouble(), scan.nextDouble()));
                    break;
                default:
                    System.out.println("lutfen gecerli bir operator giriniz");
                    break;
                case 'c':
                    System.out.println("bizi tercih ettiginiz icin tesekkurler tekrar bekleriz");
                    break;
            }

        }while (operator!='c');
        scan.close();
    }
}