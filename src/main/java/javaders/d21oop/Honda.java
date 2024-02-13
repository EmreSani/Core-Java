package d21oop;

public class Honda extends Car {

    public String model = "Civic";
    public int year = 2023;
    public Honda(){ //2
        //super.model.soutv
        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        System.out.println("Civic");
    }

    public Honda(String model){
        super();
        System.out.println("Accord");
    }

}
