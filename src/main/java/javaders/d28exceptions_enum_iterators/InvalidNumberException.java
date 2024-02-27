package javaders.d28exceptions_enum_iterators;

public class InvalidNumberException extends RuntimeException{

    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim


    public InvalidNumberException(String message) {
        super(message);
    }
}
