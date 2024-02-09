package Day4;

import java.util.ArrayList;
import java.util.List;

public class C04_OrtakIsimler {
    public static void main(String[] args) {

        /*

                Iki array'de ortak olan isimleri bir yerde toplayiniz.

                1. Array: { Jace, John, Mark, Jack, Emma}
                2. Array: { Anna, Brad, Johnny, Mark, Emma }

                Mark, Emma

         */

        String arr1[] = { "Jace", "John", "Mark", "Jack", "     Emma"};
        String[] arr2 = { "Anna", "Brad", "Johnny", "mark    ", "Emma"};

        // Yazdirmak icin
        /*
        for (String w : arr1){
            for (String s : arr2){
                if (w.trim().equalsIgnoreCase(s.trim())){
                    System.out.println(w);
                }
            }
        }
         */

        // Bir yerde toplamak icin
        List<String> ortakIsimler = new ArrayList<>();
        for (String w : arr1){
            for (String s : arr2){
                if (w.trim().equalsIgnoreCase(s.trim())){
                    ortakIsimler.add(s.trim());
                }
            }
        }

        System.out.println(ortakIsimler);



    }
}
