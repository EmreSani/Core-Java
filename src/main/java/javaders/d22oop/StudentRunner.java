package javaders.d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        //------------get
        System.out.println(s.getAge()); //13
        System.out.println(s.isSuccessful()); //true

        //------------set
        s.setAge(25);
        System.out.println(s.getAge()); //25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false

        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska
        //bir package'dan set method ile degistirilebilir mi?

    }
}
