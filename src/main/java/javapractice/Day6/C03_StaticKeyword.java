package Day6;

public class C03_StaticKeyword {
    /*

            Scope: Etki alanı/Kapsam -> Değişken ve Method'ların nerede geçerli olduklarını belirtir.

            1: static variable
            2: Instance variable
            3: Local Variable
            4: Loop Variable

     */

    /*
            - Bir class'ta instance, static değişkenler oluşturunuz.
            - Instance ve static 2 method oluşturunuz.
            - Bir main method, içerisinde 2 adet obje oluşturunuz, yazdırınız.
            - static variable değerini arttırınız.
            - obj1 instance variable'ını güncelleyiniz.
            - obj2'nin instance ve static değerini arttırınız.
            - obj1 ve obj 2'nin instance değerlerini yazdırınız.
     */

    int instanceSayi = 5;

    static int staticSayi = 10;

    public void method1(){
        System.out.println("Instance Method");
    }

    public static void method2(){
        System.out.println("Static Method");
    }



    public static void main(String[] args) {

        // Instance
        C03_StaticKeyword obj1 = new C03_StaticKeyword();

        obj1.instanceSayi = 20;

        C03_StaticKeyword.staticSayi = 15;

        System.out.println("Obj1 instanceSayi: "+obj1.instanceSayi);

        System.out.println("staticSayi: "+ C03_StaticKeyword.staticSayi);

        System.out.println("-----------------------------------");

        // 2. Instance
        C03_StaticKeyword obj2 = new C03_StaticKeyword();

        System.out.println("Obj2 instanceSayi: "+obj2.instanceSayi);

        System.out.println("staticSayi: "+ obj2.staticSayi);



        obj2.method1();
        C03_StaticKeyword.method2();


    }

}
