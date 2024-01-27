package src.ders.ders7.akis003;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Faruk", "000111", "MAT");
        Teacher t2 = new Teacher("Ayse", "000112", "FZK");
        Teacher t3 = new Teacher("Ebru", "000113", "KMY");

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t2);

        Student s1 = new Student("Cansu", "1010", 4, mat, fizik, kimya);
        s1.addAllExamNote(76,80,45);
        s1.isBolumuGectimi();


    }
}
