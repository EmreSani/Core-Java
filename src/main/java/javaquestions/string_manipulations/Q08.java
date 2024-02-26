package javaquestions.string_manipulations;

public class Q08 {
    //Create a String variable and print all characters except the last character on the console in
    //uppercases.
    //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
    public static void main(String[] args) {
        String str = "Java";
        String allCharsExceptLastChar = str.substring(0, str.length() - 1).toUpperCase();
        System.out.println(allCharsExceptLastChar);
    }
}
