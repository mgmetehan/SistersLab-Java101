package src.ders.ders2.akis002;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
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
        double ortalama= toplam / 6.0;

        System.out.println("Genel ortalamaniz:"+ortalama);
    }
}
