package src.ders.ders8.akis002;

public class Circle {
    public static final double PI = 3.14;
    private double radius;

    public double calculateArea() {
        return PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
