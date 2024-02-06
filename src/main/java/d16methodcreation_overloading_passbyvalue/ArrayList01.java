package d16methodcreation_overloading_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Interview Sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz,
        //1- ArrayList icinde olan (Java 8 sonrasi cikti)
        //2- Collections icinde olan sort()

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //Collections.sort(nums); //1-
        nums.sort(null); //2-

        System.out.println(nums); //[10, 12, 19, 23]

        int minFark = nums.get(1) - nums.get(0); //minfark kabulu yaptik

        for (int i = 1; i < nums.size(); i++) { //1 den baslattik ki 1.indexten 0.indexi cikaralim

            minFark = Math.min(minFark, nums.get(i) - nums.get(i - 1));

        }
        System.out.println(minFark); //2
        //---------------------------------------
        //En kucuk (minFark) hangi iki sayidan elde ettigimizi bulalim

        for (int i = 1; i < nums.size(); i++) {
            //minFark'i hangi cikarma isleminde buldugumuzu arastiracagiz
            //ve o cikarma islemindeki sayilari konsola yazdiracagiz

            if (nums.get(i) - nums.get(i - 1) == minFark) {
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1));
            }

        }
    }
}
