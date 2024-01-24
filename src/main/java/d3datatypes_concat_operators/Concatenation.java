package d3datatypes_concat_operators;

public class Concatenation {
    public static void main(String[] args) {
        //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile Integer'larin
        // toplamini console'a yazdirin.

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma1011
        System.out.println(s + (a + b)); //elma21
        System.out.println(s + a * b); //elma110
        System.out.println(a + b + s); //21elma

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir





    }
}
