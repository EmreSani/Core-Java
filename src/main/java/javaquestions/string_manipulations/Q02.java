package javaquestions.string_manipulations;

public class Q02 {
    //Create 3 String variables for people's names. Print the sum of the number of characters in
    //all the 3 names except space characters.
    //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console
    public static void main(String[] args) {
        String emre = "Emre Sani";
        String ela = "Ela Sani";
        String leyla = "Leyla Nur Sani";

        int emreLength = emre.replaceAll("\\s", "").length();
        System.out.println(emreLength);
        int elaLength = ela.replaceAll("\\s", "").length();
        System.out.println(elaLength);
        int leylaLength = leyla.replaceAll("\\s", "").length();
        System.out.println(leylaLength);

        System.out.println("sum: " + (emreLength + elaLength + leylaLength));


    }
}
