package javaquestions.string_manipulations;

import java.util.Locale;

public class Q01 {
    //  Create a String variable for city names which have just a single word.
    //   Print the city name with the initial is in uppercase and all the other characters
    //  are in lower cases on the console.
    public static void main(String[] args) {
        String cityName = "  ankAra";
        String adjustedCityName = cityName.trim().toLowerCase();
        adjustedCityName = adjustedCityName.substring(0, 1).toUpperCase() + adjustedCityName.substring(1).toLowerCase();
        System.out.println(adjustedCityName);
    }
}

