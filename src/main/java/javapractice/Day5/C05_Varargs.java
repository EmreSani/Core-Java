package Day5;

public class C05_Varargs {
    public static void main(String[] args) {

        String kelime1 = "merhaba";
        String kelime2 = "deneme";
        String kelime3 = "sdjkhwjshdw";

        enUzunKelimeYazdir(kelime1, kelime2, kelime3, "test");

    }

    private static void enUzunKelimeYazdir(String...kelimeler){

        String enUzunKelime = "";
        for (String kelime : kelimeler){

            if (kelime.length()>enUzunKelime.length()){
                enUzunKelime = kelime;
            }

        }
        System.out.println(enUzunKelime);


    }



}
