package javaquestions.string_manipulations;

public class Q14 {
    //Type code to check if a String has a specific single character or not in three different ways
    public static void main(String[] args) {
        String str = "Emre Sani";

        // Method 1: Using contains()
        boolean result1 = str.contains("E");
        System.out.println("Method 1: " + result1);

        // Method 2: Using regex and length
        boolean result2 = str.replaceAll("[^E]", "").length() > 0;
        System.out.println("Method 2: " + result2);

        // Method 3: Using indexOf()
        boolean result3 = str.indexOf('E') != -1;
        System.out.println("Method 3: " + result3);
    }
}
