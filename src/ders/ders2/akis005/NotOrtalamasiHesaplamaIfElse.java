package src.ders.ders2.akis005;

import java.util.Scanner;

public class NotOrtalamasiHesaplamaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fizik101 notunuzu girin:");
        int fizikNot = scanner.nextInt();

        System.out.println("Java101 notunuzu girin:");
        int javaNot = scanner.nextInt();

        System.out.println("Turkce notunuzu girin:");
        int turkceNot = scanner.nextInt();

        System.out.println("Tarih notunuzu girin:");
        int tarihNot = scanner.nextInt();

        System.out.println("Muzik notunuzu girin:");
        int muzikNot = scanner.nextInt();

        int toplam = fizikNot + javaNot + turkceNot + tarihNot + muzikNot;
        double ortalama = toplam / 5.0;

        System.out.println("Genel ortalamaniz:" + ortalama);

        if (ortalama > 80) {
            System.out.println("Notumuz AA");
        } else if (ortalama > 60) {
            System.out.println("Notumuz BB");
        } else if (ortalama > 50) {
            System.out.println("Notumuz CC");
        } else {
            System.out.println("Notumuz FF");
        }
    }
}
