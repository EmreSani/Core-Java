package Day4;

import java.util.Arrays;

public class C03_ArrayElemanEkleme {
    public static void main(String[] args) {

        /*

                Belirtilen bir array'e, istenen elemanı ekleyin

                int[] arr = { 1, 4, 23, 12}

                Istenen eleman: 5

         */

        int[] arr = { 1, 4, 23, 12 }; // 4

        int sayi = 5;

        int[] arr2 = new int[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2)); // [1, 4, 23, 12, 0]

        // arr2'ye 5 elemanini ekle
        arr2[arr2.length-1] = sayi;

        // Atama
        arr = arr2;
        System.out.println(Arrays.toString(arr));

    }
}
