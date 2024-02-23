package Day6.inheritance01;

public class Parent {

    /*
            - Variable/Field
            - Constructor
            - Method
            - Getter & Setter
            - toString
     */

    /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
     */

    // - isim ve soyisim static değişkenleri oluşturalım.
    protected static String isim = "Ali"; // Parent.isim

    protected static String soyisim = "Can"; // Parent.soyisim



    // - method1 ve method2 static method'ları oluşturalım.
    protected static void method1(){
        System.out.println("Parent class static method1");
    }

    protected static void method2(){
        System.out.println("Parent class static method2");
    }



    // - yas isimli bir instance variable oluşturalım.
    protected int yas = 30;


    // - method3 ve method4 isimli instance method'lar oluşturalım.
    protected void method3(){
        System.out.println("Parent class instance method3");
    }

    protected void method4(){
        System.out.println("Parent class instance method4");
    }



}
