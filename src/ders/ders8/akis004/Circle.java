package src.ders.ders8.akis004;

public class Circle {
    public static final double PI = 3.14;
    private double radius;

    public void ekranaYazdir(){
        System.out.println("Circle icindeki pi degeri: "+ PI);
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
