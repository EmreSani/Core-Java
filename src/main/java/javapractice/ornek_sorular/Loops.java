package javapractice.ornek_sorular;

public class Loops {
    public static void main(String[] args) {
        String result = "";



        for (int i = 1; i < 4; i++) {



            for (int j = (5 - i); j > 1; j--) {

                result = result + (i + j);

            }



            System.out.println(result);

            result = "";

        }
    }
}
