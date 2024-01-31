package d13arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] yeniArr = new int[arr.length];

        System.out.println(Arrays.toString(arr));     //[0, 2, 3, 0, 12, 0]

        System.out.println(Arrays.toString(yeniArr)); //[0, 0, 0, 0, 0, 0]
        int ilkIndex = 0;

                            //[0, 2, 3, 0, 12, 0]
        for (int w : arr){

            if (w != 0){ //Gelen sayi sifira esit degilse
                yeniArr[ilkIndex] = w;

                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr)); //[2, 3, 12, 0, 0, 0]
    }
}
