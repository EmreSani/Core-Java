package Day6.inheritance01;

public class Child extends Parent{

    public static void main(String[] args) {

        System.out.println(Parent.isim);
        Parent.method1();
        System.out.println(isim);
        method1();

        Parent p = new Parent();
        System.out.println(p.yas);

        Child c = new Child();
        System.out.println(c.yas);


        Parent parent = new Child();

        // Araba -> Opel -> Corsa
        //Araba araba = new Opel();

    }

}
