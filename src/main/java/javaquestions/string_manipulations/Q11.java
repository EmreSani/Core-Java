package javaquestions.string_manipulations;

public class Q11 {
    //Type code to check if a String does not have any space character at the beginning and at
    //the end?
    //Example: For ‘ Ali ’ your code should print false on the console
    // For ‘Ali’ your code should print true on the console
    public static void main(String[] args) {
        String str = "Emre  Sani ";
        String strTrimmed = str.trim();
        boolean result = str.equals(strTrimmed);
        System.out.println("Is there space at the beginning and/or at the end? " + !result);
    }
}
