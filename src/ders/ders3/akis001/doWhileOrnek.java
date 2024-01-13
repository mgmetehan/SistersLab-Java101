package src.ders.ders3.akis001;

import java.util.Scanner;

public class doWhileOrnek {
    public static void main(String[] args) {
/*        int sayac = 1;
        do {
            System.out.println("do while");
            System.out.println("Selamlar " + sayac);
            sayac++;
        } while (sayac == 5);

        int sayac2 = 1;
        while (sayac2 == 5) {
            System.out.println("while");
            System.out.println("Selamlar " + sayac);
            sayac2++;
        }*/

        Scanner scan = new Scanner(System.in);

        int toplam = 0, sayi;

        do {
            System.out.println("Bir sayi giriniz:");
            sayi = scan.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("Toplam:" + toplam);


    }
}
