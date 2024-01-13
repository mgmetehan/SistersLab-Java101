package src.ders.ders3.akis001;

import java.util.Scanner;

public class whileOrnek {
    public static void main(String[] args) {
/*        boolean durum = true;
        while (durum) {
            System.out.println("Kader");
            if (durum == true) {
                durum = false;
            }
        }
        System.out.println("Seyda");


        int i = 1;
        while (i<5){
            System.out.println(i+ " ");
            i++;
        }*/

/*        int i = 1;
        int n = 3;

        while (i < 5) {
            System.out.println("i " + i);
            while (n != 0) {
                System.out.println("n " + n);
                n--;
            }
            i++;
        }*/

/*        //Ornek olarak, 1'den 10'a kadar olan sayilarin toplamini bulan bir program yazalim:

        int i = 1;
        int toplam = 0;

        while (i < 11) {
            toplam += i;//toplam = toplam + i;
            i++;
        }

        System.out.println("Toplam: "+ toplam);*/

        //Kullanicidan alinan bir sayinin karesini hesaplayan bir program yazin. Program, kullanici 0 girene kadar calismalidir.

/*        Kader cozum
Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int us = 0;

        while (i != 0) {
            us = i * i;
            System.out.println("Carpim: " + us);
            i = scan.nextInt();
        }*/


/*       Kader cozum V2
 Scanner scan = new Scanner(System.in);

        int i;
        int us = 0;

        while ((i = scan.nextInt()) != 0) {
            us = i * i;
            System.out.println("Carpim: " + us);
        }*/

/*        //Kullanici sifir (0) girene kadar pozitif sayilari toplar.

        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        while ((sayi = scan.nextInt()) != 0) {//while ((sayi = scan.nextInt()) != 0 && sayi >= 0) {
            if (sayi >= 0) {
                toplam += sayi;
                System.out.println("Toplam: "+toplam);
            }
        }*/

/*        //Bir sayinin cift mi, tek mi oldugunu kontrol eden bir Java programi yazin. Kullanicidan surekli olarak sayi alin ve bu kontrolu yapin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int i = 0;

        while (i < 5 && sayi > 0) {
            if (sayi % 2 == 0) {
                System.out.println("Bu sayi ciftir!! " + sayi);
            } else {
                System.out.println("Bu sayi tektir!! " + sayi);
            }

            System.out.println("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            i++;
        }*/

/*
        //Kullanicidan bir sayi alin ve bu sayinin faktoriyelini hesaplayan bir Java programi yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyeli bulunmasini istediginiz sayiyi giriniz :");

        int sayi = scan.nextInt();
        int faktoriyel = 1;
        int i = 1;
        int counter = 1;

        while (counter < 5) {// kac kere denemek istedigini ayarlar

            while (i <= sayi) {//fakt hesaplar
                faktoriyel *= i;
                i++;
            }

            System.out.println("Sonuc1: " + faktoriyel);
            sayi = scan.nextInt();
            faktoriyel = 1;
            i = 1;
            counter++;
        }*/


/*        //!Bir ogrencinin sinav notlarini giris olarak alin ve bu notlarin ortalamasini hesaplayan bir Java programi yazin.

        Scanner scan = new Scanner(System.in);
        int i = 0;
        double toplam = 0;
        int notCounter = 0;

        while (i < 3) {
            System.out.println("Sinav notunuzu giriniz: ");
            double not = scan.nextDouble();
            toplam += not;
            i++;
            notCounter++;
        }

        if (notCounter > 0) {
            double ortlama = toplam / notCounter;
            System.out.println("Ortalama:" + ortlama);
        } else {
            System.out.println("Hic not girmediniz!!!!!");
        }*/
    }
}
