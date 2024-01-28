package src.ders.ders8.akis004;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateCylinderArea() {
        return calculateArea() * height;
    }

    public void ekranaYazdir(){
        super.ekranaYazdir();
        System.out.println("Cylinder icindeki pi degeri: "+ PI);
    }
}
