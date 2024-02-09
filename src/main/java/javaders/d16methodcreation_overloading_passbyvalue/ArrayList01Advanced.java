package javaders.d16methodcreation_overloading_passbyvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList01Advanced {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 23, 10, 19, 22, 20, 24, 25, 28, 30); // Örnek bir liste
        Collections.sort(numbers); // Listeyi küçükten büyüğe sıralayalım

        int minDifference = Integer.MAX_VALUE;

        List<Integer> resultNums1 = new ArrayList<>();
        List<Integer> resultNums2 = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            int difference = numbers.get(i + 1) - numbers.get(i);
            if (difference < minDifference) {
                minDifference = difference;
                resultNums1.clear();
                resultNums2.clear();
                resultNums1.add(numbers.get(i));
                resultNums2.add(numbers.get(i + 1));
            } else if (difference == minDifference) {
                resultNums1.add(numbers.get(i));
                resultNums2.add(numbers.get(i + 1));
            }
        }

        System.out.println("En yakın tamsayı çiftleri:");
        for (int i = 0; i < resultNums1.size(); i++) {
            System.out.println(resultNums1.get(i) + " ve " + resultNums2.get(i));
        }
    }
}
