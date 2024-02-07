package javapractice.Day5;

import java.util.Collections;

public class Arrays2 {
    public static void main(String[] args) {
/*

        Iki array'de ortak olan isimleri yazdiriniz.

        1. Array: { Jace, John, Mark, Jack, Emma}
        2. Array: { Anna, Brad, Johnny, Mark, Emma }

        Mark, Emma

 */

        String[] arr = {"Jace", "John", "Mark", "Jack", "Emma"};
        String[] arr2 = {"Anna", "Brad", "Johnny", "Mark", "Emma"};


        for (String item : arr) {

            for (String s : arr2) {

                if (item.trim().equalsIgnoreCase(s.trim())) {
                    System.out.println(item);
                }

            }

        }

        for (String s : arr) {
            for (String value : arr2) {
                if (s.equals(value)) {
                    System.out.println(s);
                }
            }
        }

        String longestWord;
        //k = k.substring(0,1).toUpperCase() + k.substring(1);


    }
}
