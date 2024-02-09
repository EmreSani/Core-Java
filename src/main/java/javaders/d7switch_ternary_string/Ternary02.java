package javaders.d7switch_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = -143;
        a = Math.abs(a); //absolute value
        String result = (a > 99 && a<1000) ? "3 basamaklidir" : "3 basamakli degildir";
        System.out.println(result);

    }

}
