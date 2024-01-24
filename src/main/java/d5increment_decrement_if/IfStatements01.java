package d5increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {

        if (3 < 5){
            System.out.println("condition dogru if calisti");
        }
        //---------------------
        if (7 == 4 + 3){
            System.out.println("condition dogru ise buraya girer");
        }
        //---------------------
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.

        int num = 12;

        if (num > -1 && num < 10){ //num >= 0

            System.out.println("Rakam");
        }
        //---------------------
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.

        int n = 67;


        if (n > 99 && n < 1000){
            System.out.println("Sayi uc basamaklidir");
        }

    }
}
