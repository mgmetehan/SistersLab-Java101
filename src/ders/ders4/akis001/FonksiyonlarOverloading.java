package src.ders.ders4.akis001;

public class FonksiyonlarOverloading {

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static double sum(double number1, double number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 8));
        System.out.println(sum(3, 5, 7));
        System.out.println(sum(1.0, 2.0, 5));
    }
}
