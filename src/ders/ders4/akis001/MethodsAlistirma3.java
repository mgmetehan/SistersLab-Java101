package src.ders.ders4.akis001;

import java.util.Scanner;

public class MethodsAlistirma3 {
    //HesapMakinesi

    public static void toplam(double sayi1, double sayi2) {
        System.out.println(sayi1 + sayi2);
    }

    public static void cikarma(double sayi1, double sayi2) {
        System.out.println(sayi1 - sayi2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesine Hos geldiniz!");

        while (true) {
            System.out.println("1. Toplama");
            System.out.println("2. Cikarma");
            System.out.println("3. Carpma");
            System.out.println("4. Bolme");
            System.out.println("5. Cikis");
            System.out.println("1-5 Arasinda Bir deger giriniz");

            int secim = scanner.nextInt();

            if (secim == 5) {
                System.out.println("Hesap Makinesi Kapaniyor...");
                break;
            }

            System.out.println("Birinci sayiyi giriniz: ");
            double number1 = scanner.nextDouble();

            System.out.println("Ikinci sayiyi giriniz: ");
            double number2 = scanner.nextDouble();

            switch (secim) {
                case 1:
                    toplam(number1, number2);
                    break;
                case 2:
                    cikarma(number1, number2);
                    break;
                case 3:
                    carpma(number1, number2);
                    break;
                case 4:
                    bolme(number1, number2);
                    break;
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin..");
            }
        }
    }

    public static void carpma(double sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
    }

    public static void bolme(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            System.out.println(sayi1 / sayi2);
        } else {
            System.out.println("Sifira bolme hatasii!");
        }

    }

}
