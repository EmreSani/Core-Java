package javaders.d27exceptions;

public class E07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        //printAge(25); //25
        printAge(-3); //-3

    } //main disi
    //Girdigimiz yasi konsola yazdiran bir method olusturalim
    public static void printAge(int age){

        if (age < 0){
            throw new IllegalArgumentException("Yasi negatif girmeyiniz");
        } else {
            System.out.println(age);
        }
        //Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
        // try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.
    }

}
