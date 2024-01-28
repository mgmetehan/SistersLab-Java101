package src.ders.ders8.akis004.universite;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private String department;
    private List<Course> coursesTaught = new ArrayList<>();

    public void teach() {
        System.out.println(getName() + " " + department + " dersini anlatiyor!");
    }

    public void assignCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " " + course.getCourseName() + " dersini veriyor!");
    }

    public Professor(String name, int age, String id, String department) {
        super(name, age, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
