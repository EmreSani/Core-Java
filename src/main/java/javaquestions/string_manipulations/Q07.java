package javaquestions.string_manipulations;

public class Q07 {
    //Create a String variable and print all characters except the first character on the console.
    // Example:If the String is ‘Java’ you should print ‘ava’ on the console
    public static void main(String[] args) {
        String str = "Java";
        String allCharsExceptFirstChar = str.substring(1);
        System.out.println("All characters except the first character:" + allCharsExceptFirstChar);

    }
}
