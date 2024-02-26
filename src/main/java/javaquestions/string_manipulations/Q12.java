package javaquestions.string_manipulations;

public class Q12 {
    //Type code to check if a String has an uppercase initial and dot at the end.
    //Example: For ‘Ali’ your code should print false on the console
    // For ‘ali.’ your code should print false on the console
    // For ‘ Ali. ’ your code should print false on the console
    // For ‘Ali.’ your code should print true on the console
    // For ‘ALI.’ your code should print true on the console
    public static void main(String[] args) {
        String str = "Emre.";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        boolean isFirstCharUpper = firstChar < 'Z' && firstChar > 'A';
        //boolean isFirstCharUpper = Character.isUpperCase(firstChar);
        boolean isLastCharDot = lastChar == '.';
        boolean isFirstCharUpperAndIsLastCharDot = isFirstCharUpper && isLastCharDot;
        System.out.println(isFirstCharUpperAndIsLastCharDot);


    }
}
