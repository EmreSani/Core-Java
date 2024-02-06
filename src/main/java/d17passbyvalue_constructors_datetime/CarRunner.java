package d17passbyvalue_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        //Car class'indan object uretelim

        //String s = new String();
        Car c1 = new Car("BMW","3.20", 2024,false); //Custom Constructor

        System.out.println(c1.brand); //Honda //BMW
        System.out.println(c1.model); //Accord //3.20
        System.out.println(c1.year); //2023 //2024
        System.out.println(c1.hybrid); //true //false

        c1.hareket(); //Honda hizli hareket eder //BMW hizli hareket eder
        c1.dur(); //Honda guvenli bir sekilde durur //BMW guvenli bir sekilde durur

        Car c2 = new Car("Audi", "A5", 2018, false);
        System.out.println(c2.brand); //Audi

        System.out.println(c1); //@7a81197d -- reference -- adres //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(c2); //@5ca881b5 -- reference -- adres //Car{brand='Audi', model='A5', year=2018, hybrid=false}

        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir
        // bir String olarak döndürmek için kullanılır.

        Car c3 = new Car("Fiat", "Sahin");
        System.out.println(c3); //Car{brand='Fiat', model='Sahin', year=2023, hybrid=true}


    }
}
