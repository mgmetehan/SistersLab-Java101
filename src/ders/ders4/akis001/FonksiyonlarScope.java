package src.ders.ders4.akis001;

public class FonksiyonlarScope {

    public static int globalValue = 15;

    public static void deneme(int a, int b) {
        System.out.println(globalValue);
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(globalValue);
        int x = 10; // main metodu icinde tanimlanan local degisken

        if (x > 5) {
            int y = 20; // if blogu icinde tanimlanan local degisken
            System.out.println(x + y);
        }

        //System.out.println(y); // Hata! y, if blogu disinda erisilemez.
    }
}
