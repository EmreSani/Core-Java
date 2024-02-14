package javaders.d22oop;

public class Accord extends Honda{

    //1- Honda'nin child'i yapildi (extends ile)
    //2- @Override yazildi
    //3- Abstract silindi
    //4- Body eklendi

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

}
