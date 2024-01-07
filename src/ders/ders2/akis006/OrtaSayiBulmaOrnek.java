package src.ders.ders2.akis006;

import java.util.Scanner;

public class OrtaSayiBulmaOrnek {
    //Soru->Kullanicidan uc sayi girmesini isteyin. Girilen uc sayi arasindaki ortanca sayiyi bulun ve ekrana yaz


    public static void main(String[] args) {
        // Scanner sinifini kullanarak kullanicidan giris almak icin bir nesne olusturuyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanicidan uc sayi girmesini istiyoruz.
        System.out.print("Birinci sayiyi girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("Ikinci sayiyi girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Ucuncu sayiyi girin: ");
        double sayi3 = scanner.nextDouble();

        // Orta sayiyi hesaplamak icin bir degisken olusturuyoruz.
        double ortancaSayi;

        // if-else ifadeleri ile her bir durumu kontrol ediyoruz.
        // Ilk durum, sayi1'in sayi2 ile sayi3 arasinda olup olmadigini kontrol eder.
        if ((sayi1 >= sayi2 && sayi1 <= sayi3) || (sayi1 <= sayi2 && sayi1 >= sayi3)) {
            ortancaSayi = sayi1;
        }
        // Ikinci durum, sayi2'nin sayi1 ile sayi3 arasinda olup olmadigini kontrol eder.
        else if ((sayi2 >= sayi1 && sayi2 <= sayi3) || (sayi2 <= sayi1 && sayi2 >= sayi3)) {
            ortancaSayi = sayi2;
        }
        // Eger yukaridaki durumlar saglanmazsa, sayi3 ortanca sayidir.
        else {
            ortancaSayi = sayi3;
        }

        // Sonucu ekrana yazdiriyoruz.
        System.out.println("Girilen uc sayi arasindaki ortanca sayi: " + ortancaSayi);
    }

    /* Fidan'in cozumu
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        System.out.println("Birinci Sayiyi giriniz: ");
        a = scan.nextDouble();

        System.out.println("Ikinci Sayiyi giriniz: ");
        b = scan.nextDouble();

        System.out.println("Ucuncu Sayiyi giriniz: ");
        c = scan.nextDouble();

        if ((b > a && b < c) || (b > c && b < a)){
            System.out.println("Ortanca sayi: "+ b);
        }
        ...
    }
     */
}
