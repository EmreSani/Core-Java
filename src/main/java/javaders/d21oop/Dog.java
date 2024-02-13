package d21oop;

public class Dog extends Mammal {

    public void bark(){
        System.out.println("Dogs bark...");
    }
    @Override
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){ //Data type Animal'dir
        return new Dog(); //Dog urettik, disari Animal verdik
        //cunku parent'in data tipi child'in data tipini kapsar
    }

    @Override
    public int add(int a, int b) {
        return a + b;
        //primitive'lerde return type degistirilemez
        //cunku burada parent-child iliskisi yoktur
    }

/*    @Override
    public Integer carpma(Integer a, Integer b) {
        return a * b;

    }*/

    @Override
    public Integer carpma(Integer a, Integer b) {
        Integer sonuc = super.carpma(a, b);

        //ek islevsellik katalim
        return sonuc + 10;


    }
}
