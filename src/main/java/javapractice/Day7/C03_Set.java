package Day7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
verilen bir arrayden tekrar eden elemanları silip
unique elemanlardan oluşan bir array haline dönüştüren metod oluşturun
int arr[]={1,2,2,3,4,4,5};-->{1,2,3,4,5}
 */
public class C03_Set {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        System.out.println(Arrays.toString(arr));

        arr=benzersizyap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] benzersizyap(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for (int i:arr){
            set.add(i);//1,2,3,4,5
        }

        int[] uniqueArr=new int[set.size()];
        int index=0;
        for (int s:set){
            uniqueArr[index]=s;
            index++;
        }
      return uniqueArr;
    }


}












