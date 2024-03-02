package javaders.d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        //Course class'in parametreli constructor'ini kullanarak 4 tane Object olusturalim

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //System.out.println(coursesList);
        //[Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132},
        // Course{season='Winter', courseName='English Night', averageScore=93, numberOfStudents=144}]
        //--------------------------
        //1)Tum "averageScore" larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz

        //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
        // kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
        // aksi takdirde false döndürür.(VE gibi)

        boolean result1 = coursesList.stream().allMatch(t -> t.getAverageScore() > 91);
        System.out.println(result1); //true
        //--------------------------
        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz

        boolean result2 = coursesList.stream().allMatch(t -> t.getNumberOfStudents() > 100);
        System.out.println(result2); //true
        //--------------------------
        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
        //Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi)

        boolean result3 = coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result3); //true
        //--------------------------
        //4) Sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result4 = coursesList.stream().anyMatch(t -> t.getSeason().contains("Summer"));
        System.out.println(result4); //true

        //--------------------------
        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.

        //noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
        //Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.

        boolean result5 = coursesList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result5); //true, Fall yok anlaminda true verdi

        //--------------------------
        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result6 = coursesList.stream().noneMatch(t-> t.getCourseName().contains("German"));
        System.out.println(result6); //true

        //7)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz. ODEV.

        //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
        //Özel bir sıralama için bir Comparator’da alabilir.
        //b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
        //c) reversed, Bir Comparator'ın sıralama sırasını tersine çevirir.
        //d) findFirst, Stream'deki ilk elemanı döndüren bir Optional döner.

        System.out.println(getCourseNamesWhoseAvgMax(coursesList));


    }
    public static String getCourseNamesWhoseAvgMax(List<Course> coursesList) {
        //konteynira koyarsak tekrar tekrar kullanabiliriz
        Course course = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get();  //findFirst Optional olarak verir (4 datayi da iceren bir data verir) get()'e ceviridk

        return course.getCourseName();  //burda 4  datayi iceren datada sadece birini aldik

        //ikinci yol:
       /* return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).reversed()).
                findFirst().
                get().getCourseNmae();
        */
    }
}
