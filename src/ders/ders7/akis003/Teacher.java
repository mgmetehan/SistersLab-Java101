package src.ders.ders7.akis003;

public class Teacher {
    private String name;
    private String code;
    private String branch;

    public Teacher(String name, String code, String branch) {
        this.name = name;
        this.code = code;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
