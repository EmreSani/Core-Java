package javaquestions.string_manipulations;

public class Q05 {
    //Create a String variable and print just the last non-space character on the console for any
    //String.
    //Example: For ‘Ali Can’ you should print n
    // For ‘Miami ’ you should print i etc.
    public static void main(String[] args) {
        String str = "Emre Cana   ";
        int idxOfLastNonSpace = str.trim().length() - 1;
        String lastNonSpaceChar = str.substring(idxOfLastNonSpace);
        System.out.println(lastNonSpaceChar);


    }
}
