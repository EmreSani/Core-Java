package javaders.d19stringbuilder_buffer_accessmodifier_static;

public class Student {
    //Access Modifier - Erisim Belirleyici
    /*
    1)public
    2)protected
    3)default
    4)private

    public > protected > default > private

    public      ==> public olanlar her class’dan kullanilabilir
    protected   ==> protected olanlar baska package’lardan kullanilamaz,
     ancak baska package’larda child classlar icinden kullanilabilir
    default     ==> default olanlar baska package’lardan kullanilamazlar
    private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

    Soru: ”protected ile default" arasindaki farki söyleyiniz?
    Cevap: protected olanlar baska package’lardan kullanilamaz ancak baska package’larda
    child classlar icinden kullanilabilir. default olanlar baska package’lardan kullanilamazlar
 */

    public String stdName = "Ali Can";

    protected String address = "Istanbul";

    String email  = "alican@gmail.com";

    private String tcKimlik = "12345678";

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
