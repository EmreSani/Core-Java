package javaders.d20instanceblock_oop;

public class Honda extends Car{

    public Honda(){
        //1-
        super();
        System.out.println("Civic");
    }
    //B
    public Honda(String model){
        super("Sport");
        System.out.println("Accord");
    }

}
