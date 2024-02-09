package javaders.d15arraylist_methodcreation;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3]

        //indexOf(Object o) metodu, belirli bir öğenin ArrayList içerisindeki ilk görüldüğü indeksini döndürmek
        // için kullanılır. Eğer verilen öğe ArrayList içinde mevcut değilse, bu metod -1 değerini döndürür.

                            //[23, 24, 12, 9, 3]
        for (Integer w : list) {

            if (w % 2 != 0) {
                list.set(list.indexOf(w), 11);
            }
        }
        System.out.println(list); //[11, 24, 12, 11, 11]
    }
}
