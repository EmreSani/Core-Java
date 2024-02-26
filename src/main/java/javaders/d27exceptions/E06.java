package javaders.d27exceptions;

public class E06 {
    public static void main(String[] args) {

        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur

        String s = "Java";
        karakterSayisi(s); //4

        String t = "";
        karakterSayisi(t); //0

        String u = null;
        karakterSayisi(u);


    }

    public static void karakterSayisi(String s){

        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null degeriyle length() methodunu kullanmayiniz");
            //null degeriyle length() methodunu kullanmayiniz
        }

    }


}
