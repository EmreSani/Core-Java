package javaquestions.string_manipulations;

public class Q09 {
    //Create a String variable and print all characters except the first character and the last
    //character on the console in uppercases.
    //Example:If the String is ‘Java’ you should print ‘AV’ on the console
    public static void main(String[] args) {
        String str = "Java";
        String allCharsExceptFirstAndLastChars = str.substring(1, str.length() - 1).toUpperCase();
        System.out.println(allCharsExceptFirstAndLastChars);
    }
}
