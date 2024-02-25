package javaquestions.variables;

public class Q03 {
    //Type a code to find simple interest.
    //Note: Simple interest formula = principal * rate * numberOfYear / 100

    public static void main(String[] args) {
        int principal = 10000;
        int rate = 6;
        int numberOfYear = 5;
        int simpleInterest = principal * rate * numberOfYear / 100;
        System.out.println("the simple interest is= " +simpleInterest);
    }
}
