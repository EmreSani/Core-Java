package javaquestions.string_manipulations;

public class Q04 {
    //Create a String variable, print the number of non-digit characters in the String on the
    //console.
    //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
    public static void main(String[] args) {
        String str = "1a3Bcf4!...@a";
        int numOfNonDigitChars = str.replaceAll("[0-9]", "").length();
        System.out.println("Total number of non-digit characters: " + numOfNonDigitChars); //10

    }


}
