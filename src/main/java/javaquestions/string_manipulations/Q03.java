package javaquestions.string_manipulations;

public class Q03 {
    //Create a String variable, print the total number of alphabetical and numeric characters in
    //the String on the console.
    //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
    public static void main(String[] args) {
        String s = " Miami 33018!!! ";

        if (s != null) {
            // Combine both replacements into a single regular expression
            String cleanedString = s.replaceAll("[^A-Za-z0-9]", "");

            // Calculate the length of the cleaned string
            int numOfChars = cleanedString.length();

            System.out.println("Total num of alphabetical and numeric characters chars: " + numOfChars);
        } else {
            System.out.println("Input string is null.");
        }
    }
}
