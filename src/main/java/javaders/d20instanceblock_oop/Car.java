package javaders.d20instanceblock_oop;

public class Car extends Vehicle{

    public Car(){
        //2-
        super();
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda",2024,"Elektrikli");
        System.out.println("Sport");
    }

}
