package src.ders.ders8.akis004;

public class KalitimOrnek {
    public static void main(String[] args) {
        SarisinInsanlar s1 = new SarisinInsanlar();
        s1.nefesAl();
        s1.nefesVer();

        Circle c1 = new Circle(10);
        System.out.println(c1.calculateArea());

        Cylinder cylinder = new Cylinder(10,5);
        System.out.println(cylinder.calculateArea());
        System.out.println(cylinder.calculateCylinderArea());
        cylinder.ekranaYazdir();

    }
}
