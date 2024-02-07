package javapractice.Day5;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] arr = {1,4,23,12};
        
        int sayi = 5;
        
        int[] arr2 = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            arr2 [i] = arr [i];
            
        }


        
        arr2[arr2.length-1] = sayi;

        System.out.println(Arrays.toString(arr2));

        arr = arr2;
        System.out.println(Arrays.toString(arr));
        
    }
}
