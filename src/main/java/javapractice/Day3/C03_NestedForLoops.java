package Day3;

public class C03_NestedForLoops {

    public static void main(String[] args) {

        /*

                *
                * *
                * * *
                * * * *
                * * * * *
                * * * *
                * * *
                * *
                *

         */

        int sayi = 5;

        for (int i=0; i<sayi; i++){

            for (int j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        // 2. Yol
        /*
        for (int i=1; i<sayi+1; i++){

            for (int j=1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        */


        /*
                 * * * *
                 * * *
                 * *
                 *
         */

        // 1. Yol
        for (int i=sayi-1; i>0; i--){

            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        // 2. Yol
        /*
        for (int m=0; m<sayi-1;m++){
            for(int n=sayi-1; n>m; n-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

    }

}
