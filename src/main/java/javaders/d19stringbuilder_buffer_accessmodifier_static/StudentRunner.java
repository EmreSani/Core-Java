package javaders.d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student class'tan bir instance olusturalim
        Student ali = new Student();

        System.out.println(ali.stdName); //Ali Can - public
        System.out.println(ali.email); //alican@gmail.com, default- ayni package, ulastik
        System.out.println(ali.address); //Istanbul- protected-ayni package
        //farkli package olsa, child'lar gorur
        //System.out.println(ali.tcKimlik); HATA- private

        System.out.println(ali); //@36baf30c

    }
}
