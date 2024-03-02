package javaders.d31lambda;

public class Utils {

    /*Java'da "Utils" (fayda-araclar-utilities) class’i oluşturmanın temel mantığı,
    belirli bir konsept veya işlevsellikle ilgili yardımcı (helper) metotları bir araya toplamaktır.
    Bu class’lar genellikle static metotlardan oluşur ve doğrudan class adı üzerinden çağrılırlar.

    Buraya  Java’da olmayan ama bizim surekli projemizde kullandigimiz bir islevi method olarak ekleriz
    ve onu cagirip kullaniriz. Amaca uygun yeni methodlar olusturabiliriz.*/

    public static void printInTheSameLineWithSpace(Object obj){
        System.out.print(obj + " ");
    }

    public static boolean isNumberEven(int num){
        return num % 2 == 0;
    }


}
