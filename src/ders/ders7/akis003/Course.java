package src.ders.ders7.akis003;

public class Course {
    private String courseTeacher;
    private String name;
    private String code;
    private String prefix;
    private int not;

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.getBranch())) {
            this.courseTeacher = t.getName();
            System.out.println("Islem Basarili");
        } else {
            System.out.println(t.getName() + " hoca " + this.name + " dersi veremez!!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Bu dersi veren hoca :" + this.courseTeacher);
        } else {
            System.out.println("Bu derse hoca atanmamistir!");
        }
    }


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
