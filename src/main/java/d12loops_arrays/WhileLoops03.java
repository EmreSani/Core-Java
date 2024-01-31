package d12loops_arrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;

        String m = String.valueOf(k); // "312"
        String reversed = ""; //ters cevrilmis olani bunun icinde saklayacagiz

        int n = m.length() - 1; //son index'i alip, n degiskenine yukledik

        while (n >= 0) { //n > -1
            reversed = reversed + m.charAt(n);

            n--;
        }
        System.out.println(reversed); //"313"

        if (m.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom degildir");
        }

    }
}
