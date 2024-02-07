package javaquestionbank;

public class Scratch {



    public static void main(String[] args) {
        String str2 = "şeyhanyyyy yavuz";

        System.out.println(str2.replace("s", "S"));
        System.out.println(str2.replace("y", "Y"));

        System.out.println(str2.replace('s', 'S'));
        System.out.println(str2.replace('y', 'Y'));

        String str = "Java Kolaydıraaa";

        System.out.println(str.substring(8, 9));

        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("dir"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("Java Kolaydır"));

        String str5 = "Java";
        System.out.println(str5.replace("","/"));
        String str6 = str5.replace("", "/");

        System.out.println(str6.replace("","/"));

        String s5 = "Java is Java";
        System.out.println(s5.indexOf("Java"));
        System.out.println(s5.indexOf("va", 5));

        for ( char i = 'f'; i>'a'; i--){
            System.out.print(i + " " );
            i--;
        }

        int product = 1;
        for(int i=5; i>=0; i--){
            product = product * i;
        }
        System.out.println(product);



    }

}