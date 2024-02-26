package javaquestions.string_manipulations;

public class Q15 {
    //) String shirtPrice = ‘$12.99’;
    //String bookPrice = ‘$35.99’;
    //Type code to find the sum of the shirt and book prices
    public static void main(String[] args) {
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String s = shirtPrice.replaceAll("[$]", "");
        String b = bookPrice.replaceAll("[$]", "");
        double x = Double.valueOf(s);
        System.out.println(x);
        double y = Double.valueOf(b);
        System.out.println(y);
        double sum = x + y;

        // Format the output to display only two decimal places
        System.out.printf("Total price is $%.2f\n", sum);

    }
}
