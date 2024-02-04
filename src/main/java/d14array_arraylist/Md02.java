package d14array_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};

        //1.adim: Iki boyutlu bir Array'de kac eleman oldugunu bulan kodu yazalim
        //2.adim: Tek boyutlu Array'i, iki boyutlu Array'in eleman sayisini kullanarak olusturalim
        //3.adim: Iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim

        //1.adim: Iki boyutlu bir Array'de kac eleman oldugunu bulan kodu yazalim
        int toplamElemanSayisi = 0;

        for (int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi); //5

        //2.adim: Tek boyutlu Array'i, iki boyutlu Array'in eleman sayisini kullanarak olusturalim

        int[] newArr = new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr)); //[0, 0, 0, 0, 0]

        //3.adim: Iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim
        int idx = 0;

        for (int[] w : numbers){

            for (int k : w){
                newArr[idx] = k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2]








    }
}
