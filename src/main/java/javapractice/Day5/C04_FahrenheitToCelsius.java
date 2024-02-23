package Day5;

public class C04_FahrenheitToCelsius {
    public static void main(String[] args) {

        // Fahrenheit'ı, Celcius'a çeviren kodu yazınız.
        // Formül: Celsius = (Fahrenheit-32) / 1.8

        double fahrenheit = 150.5;

        double celsius = convert(fahrenheit);
        System.out.println(celsius);

    }

    private static double convert(double fahrenheit){

        //double celsius = (fahrenheit-32)/1.8;
        //return celsius;

        return (fahrenheit-32)/1.8;

    }

}
