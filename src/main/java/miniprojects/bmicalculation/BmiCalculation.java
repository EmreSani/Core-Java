package miniprojects.bmicalculation;
import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your current weight: ");
        double weight = scan.nextDouble() ;

        System.out.print("Please enter your current height (in cm): ");
        double height = scan.nextDouble() / 100;

        double bmi = weight / (height * height);


        if(bmi < 18.5){
            System.out.println("\n" + "Weight : " + weight + "\n" + "\nHeight : "  + height + "\n" +
                    "\nBMI : " + bmi + "\n" + "\n- You are underweight. ");
        }else if(bmi >= 18.5 && bmi < 25){
            System.out.println("\n" + "Weight : " + weight + "\n" + "\nHeight : "  + height + "\n" +
                    "\nBMI : " + bmi + "\n" +"\n- You are at a healthy weight. ");
        }else if(bmi >= 25 && bmi <30){
            System.out.println("\n" + "Weight : " + weight + "\n" + "\nHeight : "  + height + "\n" +
                    "\nBMI : " + bmi + "\n" +"\n- You are overweight. ");
        }else if(bmi >= 30){
            System.out.println("\n" + "Weight : " + weight + "\n" + "\nHeight : "  + height + "\n" +
                    "\nBMI : " + bmi + "\n" + "\n- You are obese. ");
        }
    }
}
