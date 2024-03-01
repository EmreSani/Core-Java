package javaders.d30lambda;

import java.util.*;

public class Lambda07 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        //minimum1(nums);
        //minimum2(nums);
        //minimum3(nums);
        //minimum4(nums);
        minimum5(nums);

    }

    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol:
    public static void minimum1(List<Integer> nums) {

        Integer min = nums.stream().distinct(). //2, 3, 4, 5, 11, 10
                reduce((t, u) -> t > u ? u : t).get();

        System.out.println(min); //2

    }

    //2.yol:
    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.
    public static void minimum2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()). //11,10,5,4,3,2
                reduce((t, u) -> u).get();
        System.out.println(min);//2
    }
    //3.yol:
    public static void minimum3(List<Integer> nums){
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);

        if (min.isPresent()){ //min'de bir deger var mi?
            System.out.println(min.get()); //2
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }
    }
    //4.yol:
    public static void minimum4(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min); //2
    }
    //5.yol:
    public static void minimum5(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min); //2
    }

}
