package src.ders.ders8.akis004.universite;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String major;
    private List<Course> enrolledCourses = new ArrayList<>();

    public void study() {
        System.out.println(getName() + " su an " + major + " dersine calisiyor.");
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(getName() + " " + course.getCourseName() + " dersine kayit oldu!");
    }

    public Student(String name, int age, String id, String major) {
        super(name, age, id);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
