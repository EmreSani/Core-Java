public class MyClass {
    static int num1;
    static String name = "Ali";
    public static void main(String []args){
        System.out.println(num1 + "main");
        add();
        product(5);



    }
    public static void add(){
        num1++;
        System.out.println(num1 + "add");

        int num2 = 6;
        char letter;
        System.out.println("“Do addition”");
    }
    public static void product(int num3){
        name = "“Veli”";
        System.out.println(num1 + "product");
        System.out.println(num3 * num3);
    }
}
