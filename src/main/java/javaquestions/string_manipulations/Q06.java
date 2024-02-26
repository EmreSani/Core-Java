package javaquestions.string_manipulations;

public class Q06 {
    //Create a String variable and find the sum of the ASCII values of the first and the last
    //characters of the String.
    public static void main(String[] args) {
        String str = "Emre Sani";
        String trimmedStr = str.trim();
        int asciiOfFirstChar = trimmedStr.charAt(0);
        int asciiOfLastChar = trimmedStr.charAt(trimmedStr.length() - 1);
        System.out.println("Total ASCII values of first and last chars: " + (asciiOfFirstChar + asciiOfLastChar));
    }
}
