package Day2;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        /*

                Kullanıcıdan 0-4 arasında bir puan girdisi isteyin.

                Eğer ki puanı,
                    0,0 - 1,0 arasinda ise: KALDI yaziniz.
                    1,0 - 2,0 arasinda ise: GECTI yaziniz.
                    2,0 - 2,5 arasinda ise: IYI yaziniz.
                    2,5 - 3,5 arasinda ise: UST yaziniz.
                    3,5 - 4,0 arasinda ise: HARIKA yaziniz.

                Devaminda,

                Switch Case kullanarak harf notlari veriniz.
                    KALDI   = F
                    GECTI   = D
                    IYI     = C
                    UST     = B
                    HARIKA  = A


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Puaninizi yaziniz:");
        double puan = scanner.nextDouble();


        String seviye = "";

        if (puan >= 0 && puan < 1){
            seviye = "KALDI";
        } else if (puan >= 1 && puan < 2) {
            seviye = "GECTI";
        } else if (puan >= 2 && puan < 2.5) {
            seviye = "IYI";
        } else if (puan >= 2.5 && puan < 3.5) {
            seviye = "UST";
        } else if (puan >= 3.5 && puan <= 4){
            seviye = "HARIKA";
        } else{
            seviye = "Geçersiz.";
        }

        switch (seviye){
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTI":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARIKA":
                System.out.println("A");
                break;
            default:
                System.out.println("Tanımlanamıyor.");
                break;
        }


    }
}
