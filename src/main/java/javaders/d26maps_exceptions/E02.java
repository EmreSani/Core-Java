package javaders.d26maps_exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234a";
        convertStringToInt(s);


    } //main disi
    public static void convertStringToInt(String s){
        int intS = Integer.valueOf(s);
        System.out.println(intS + 1); //1'i donusturup donusturmedigini anlamak icin yazdik. 1235
    }

}
