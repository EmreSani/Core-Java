package javaders.d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //1. yol: Hard Code - tavsiye edilmez

        String a = "abcde@gmail.com";
        System.out.println(a.substring(4, 9)); //gmail

        //2. yol: Dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1); //gmail

        //3.yol: Dinamik
        //indexOf() method'u spesifik bir karakterin ilk gorunumunun index'ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingIndex = a.indexOf("@") + 1; //4
        int endingIndex = a.indexOf("."); //9

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName);





    }
}