package src.ders.ders2.akis001;

import java.util.Scanner;

public class ScannerOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Adinizi Giriniz:");
        String ad = scan.next();
        System.out.println("Selamlar,"+ad);*/

/*        System.out.println("Makalenizi yazin!");
        String makale = scan.nextLine();*/

/*        System.out.println("Okul numaranizi giriniz!");
        int number= scan.nextInt();*/

        System.out.println("Karakter giriniz:");
        char c = scan.next().charAt(0);
        System.out.println("Girmis oldugunuz karakter:"+c);

    }
}
