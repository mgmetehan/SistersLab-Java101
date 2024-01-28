package src.ders.ders8.akis004.universite;

public class UniversitySystem {

    /*
1. **Temel Sinif: `Person` (Kisi)**
    - `name` (ad), `age` (yas), `id` (kimlik) ozellikleri icerir.
    - `introduce` metoduyla kisiyi tanitan bir davranisa sahiptir.

2. **Ogrenci Sinifi: `Student` (Ogrenci)**
    - `Person` sinifindan turetilir.
    - `major` (ana dal), `enrolledCourses` (kayitli dersler) ozelliklerini icerir.
    - `study` ve `enrollCourse` metotlariyla ogrenciye ozgu davranislari icerir.

3. **Profesor Sinifi: `Professor` (Profesor)**
    - `Person` sinifindan turetilir.
    - `department` (bolum), `coursesTaught` (verilen dersler) ozelliklerini icerir.
    - `teach` ve `assignCourse` metotlariyla profesore ozgu davranislari icerir.

4. **Ders Sinifi: `Course` (Ders)**
    - `courseCode` (ders kodu), `courseName` (ders adi) ozelliklerini icerir.
    - `displayInfo` metoduyla ders bilgilerini gosterir.

5. **Universite Sistemi Sinifi: `UniversitySystem`**
    - Ogrenci kaydi, profesor atama ve ders listeleme gibi universite sistemine ozgu islemleri icerir.
     */

    public static void main(String[] args) {
        Student s1 = new Student("Kader", 22, "1001", "Biyoloji");
        s1.introduce();
        s1.study();
        Professor p1 = new Professor("Seyda", 22, "0001", "Muhendislik");
        p1.introduce();

        Course c1 = new Course("CE101", "Comp Eng101");
        c1.displayInfo();
        Course c2 = new Course("CE102", "Comp Eng102");
        c2.displayInfo();

        s1.enrollCourse(c1);

        p1.assignCourse(c1);
        p1.assignCourse(c2);

        p1.teach();

        Student s2 = new Student("Alperen", 24, "1002", "Matematik");
        //System.out.println(s2.getEnrolledCourses().get(0).getCourseName());
        s2.enrollCourse(c1);
        System.out.println(s2.getEnrolledCourses().get(0).getCourseName());

    }
}
