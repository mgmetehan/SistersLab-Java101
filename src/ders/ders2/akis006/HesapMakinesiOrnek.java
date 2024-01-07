package src.ders.ders2.akis006;

import java.util.Scanner;

public class HesapMakinesiOrnek {
    //Soru->Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpa islemlerinden birisini sectigi bir hesap makinesi uygulamasi yapin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ilk Sayiyi giriniz:");
        double sayi1 = scan.nextDouble();

        System.out.println("Ikinci Sayiyi giriniz:");
        double sayi2 = scan.nextDouble();

        System.out.println("Hangi Islemi yapmak istersiniz? +,-,*,/");
        char islem = scan.next().charAt(0);

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println("Hata: Sayi2 sifir olamaz!!");
                } else {
                    sonuc = sayi1 / sayi2;
                }
                break;
            default:
                System.out.println("Hatali Islem secildi!!!");
        }

        System.out.println("Sonuc: " + sonuc);
    }
}
