package Day5;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /*

                Bir array oluşturun.

                Devamında, her bir elemanı, iç array elemanlarının toplamına eşit olan tek boyutlu yeni bir array haline getirin.

                Örn:

                int[][] arr = { {3,4}, {7,2}, {9,5} }
                -->
                { 7, 9, 14 }

         */

        int[][] arr = { {3,4}, {7,2}, {9,5} };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        int[] brr = new int[arr.length];

        int idx = 0;

        for (int[] w : arr){

            int toplam = 0;
            for (int sayi : w){
                toplam += sayi; // toplam = toplam + sayi
            }
            brr[idx] = toplam;
            idx++;

        }

        System.out.println(Arrays.toString(brr));


        // for
        int[][] arr1 = { {3,4}, {7,2}, {9,5} };

        int[] brr1 = new int[arr1.length];

        for (int i=0; i<arr1.length; i++){

            int toplam = 0;
            for (int j=0; j<arr1[i].length; j++){

                toplam += arr1[i][j];

            }
            brr1[i] = toplam;

        }

        System.out.println(Arrays.toString(brr1));



    }
}
