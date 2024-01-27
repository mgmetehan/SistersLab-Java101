package src.ders.ders7.akis003;

public class Student {
    private String name;
    private String stdNo;
    private int classes;
    private Course mat;
    private Course fizik;
    private Course kimya;
    private double avarge;
    private boolean isPass;

    public void addAllExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.setNot(mat);
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.setNot(fizik);
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.setNot(kimya);
        }
    }

    public void ortalama() {
        this.avarge = (this.mat.getNot() + this.fizik.getNot() + this.getKimya().getNot()) / 3;
    }

    public boolean isGectimi() {
        ortalama();
        return this.avarge > 50;
    }

    public void isBolumuGectimi() {
        if (this.mat.getNot() == 0 || this.fizik.getNot() == 0 || this.kimya.getNot() == 0) {
            System.out.println("Ders notlari daha girilmemis lutfen bekleyin !!!");
        } else {
            this.isPass = isGectimi();
            printNote();
            System.out.println("Ortalama: " + this.avarge);
            if (this.isPass) {
                System.out.println("Sinifi Gecti!");
            } else {
                System.out.println("Sinif Tekrari !!!!!!!!");
            }
        }
    }

    public void printNote() {
        System.out.println("**************");
        System.out.println(this.name);
        System.out.println("Mat not: " + this.mat.getNot());
        System.out.println("Fizik not: " + this.fizik.getNot());
        System.out.println("Kimya not: " + this.kimya.getNot());
    }


    public Student(String name, String stdNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public Course getMat() {
        return mat;
    }

    public void setMat(Course mat) {
        this.mat = mat;
    }

    public Course getFizik() {
        return fizik;
    }

    public void setFizik(Course fizik) {
        this.fizik = fizik;
    }

    public Course getKimya() {
        return kimya;
    }

    public void setKimya(Course kimya) {
        this.kimya = kimya;
    }

    public double getAvarge() {
        return avarge;
    }

    public void setAvarge(double avarge) {
        this.avarge = avarge;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }
}
