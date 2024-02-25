package javaquestionbank.variables;

public class Q06 {
    //Create 3 float variables for the price of a book, notebook, and laptop.
    //Print the total price of 2 books, 4 notebooks and 3 laptops on the console


    public static void main(String[] args) {
        float book =4.99F;
        float notebook = 9.99F;
        float laptop = 199.22F;
        float totalPrice = 2*book+4*notebook+3*laptop;

        System.out.println("total price: "+ totalPrice);

    }

}
