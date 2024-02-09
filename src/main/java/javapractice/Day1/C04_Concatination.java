package Day1;

public class C04_Concatination {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        // Yalnizca yukaridaki degiskenleri kullanarak, asagidaki ifadeleri olusturun:
        /*
                Java5
                Java8Guzel
                2Guzel15
                Java22
         */
        // Java5
        System.out.println(str1+sayi1);

        // Java8Guzel
        System.out.println(str1 + (sayi1+sayi2) + str2);

        // 2Guzel15
        System.out.println((sayi1-sayi2)+str2+ (sayi1*sayi2));

        // Java22
        System.out.println(str1 + (sayi1-sayi2) + (sayi1-sayi2));

    }

}
