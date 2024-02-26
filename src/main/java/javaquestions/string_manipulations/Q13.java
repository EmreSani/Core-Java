package javaquestions.string_manipulations;

public class Q13 {
    //Type code to check if a password is valid or not for the following conditions;
    //Password must have at least 8 characters different from space character
    //Password must have at least 1 symbol
    //Example: For ‘A2b!’ your code should print false on the console
    // For ‘A2b3cdef’ your code should print false on the console
    // For ‘!1a23b4’ your code should print false on the console
    // For ‘!1a23b4?es’ your code should print true on the console
    // For ‘! a b 3 k’ your code should print false on the console
    public static void main(String[] args) {
        String password = "A2b!asdf";
        boolean atLeastEightChars = password.replaceAll("\\s", "").length() >= 8;
        boolean atLeastOneSymbol = password.replaceAll("\\s", "").replaceAll("[A-Za-z0-9]", "").length() > 0;

        System.out.println("Is the password valid? " + (atLeastEightChars && atLeastOneSymbol));


    }
}
