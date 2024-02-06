package javapractice.ornek_sorular;

import java.util.Arrays;
import java.util.Scanner;

public class AreAnagrams {
    /*
         An anagram is a word formed by rearranging the letters of another word.
Write a Java code to determine whether two words entered by the user are anagrams.
isAnagram("listen", "Silent") ==> true
         */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str1, str2;

        while (true) {
            System.out.println("Please enter the first word:");
            str1 = input.nextLine().toLowerCase().trim();
            if (str1.isEmpty()) {
                System.out.println("You must enter a word. Please try again.");
            } else if (!containsOnlyLetters(str1)) {
                System.out.println("You must enter only letters. Please try again.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Please enter the second word:");
            str2 = input.nextLine().toLowerCase().trim();
            if (str2.isEmpty()) {
                System.out.println("You must enter a word. Please try again.");
            } else if (!containsOnlyLetters(str2)) {
                System.out.println("You must enter only letters. Please try again.");
            } else {
                break;
            }
        }

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        input.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean containsOnlyLetters(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
