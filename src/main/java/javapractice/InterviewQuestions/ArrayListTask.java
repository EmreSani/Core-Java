package javapractice.InterviewQuestions;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        // Part 1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        for (String renk : colors) {
            System.out.println(renk);
        }

        // Part 2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist


        addElementAtIndex(colors, "Purple", 0);
        System.out.println(colors);

        // Part 3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]


        addElementBeforeLast(colors, "Orange");
        System.out.println(colors);
    }

    // Part 2 method:
    public static void addElementAtIndex(ArrayList<String> arrayList, String element, int index) {
        arrayList.add(index, element);
    }

    // Part 3 method:
    public static void addElementBeforeLast(ArrayList<String> arrayList, String element) {
        int lastIndex = arrayList.size() - 1;
        arrayList.add(lastIndex, element);
    }
}