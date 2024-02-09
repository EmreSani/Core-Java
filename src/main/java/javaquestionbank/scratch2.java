package javaquestionbank;

import java.sql.Array;
import java.util.Arrays;

public class scratch2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println(arr1.equals(arr2));

        int arr[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 5));

        String str = "Cok calis, mutevazi ol";
        String[] strArray = str.split(",");
        System.out.println(Arrays.toString(strArray));
        String[] strArray1 = str.split("X");
        System.out.println(Arrays.toString(strArray1));
    }


}






