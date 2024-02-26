package javaquestions.string_manipulations;

public class Q10 {
    //Type code to check if a String has just a single space character any position in the middle
    //Example: For ‘Ali Can’ your code should print false on the console
    // For ‘ Ali Can ’ your code should print false on the console
    // For ‘ Ali Can ’ your code should print false on the console
    // For ‘Ali Can’ your code should print true on the console
    public static void main(String[] args) {
        String str = "  Emre CanEmre";
        String strTrimmed = str.trim();
        int trimmedStrLength = strTrimmed.length();
        int strWithoutSpaceLength = strTrimmed.replaceAll("\\s" , "").length();
        Boolean isThereSingleSpaceInTheMiddle = (trimmedStrLength - strWithoutSpaceLength) == 1;
        System.out.println(isThereSingleSpaceInTheMiddle);

    }
}
