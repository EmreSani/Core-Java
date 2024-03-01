package javaders.d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        maksimum4(nums);

    } //main disi

    //1)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1.yol:
    //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    public static void maksimum1(List<Integer> nums) {
//2, 2, 4, 5, 11, 10
        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //2.yol:
    public static void maksimum2(List<Integer> nums) {

        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //3.yol:
    //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)
    public static void maksimum3(List<Integer> nums) {

//2, 2, 4, 5, 11, 10
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();

        System.out.println(max);

    }

    //4.yol:
    public static void maksimum4(List<Integer> nums){
        Integer max = nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }


}
