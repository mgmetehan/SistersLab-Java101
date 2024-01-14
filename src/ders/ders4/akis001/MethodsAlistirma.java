package src.ders.ders4.akis001;

import java.util.Scanner;

public class MethodsAlistirma {
    //Java ile klavyeden girilen N tane sayma say?s?ndan en b?y?k ve en k???k say?lar? bulan ve bu say?lar? ekrana yazan program? yaz?n.

    public static int findMax(int currentMax, int max) {
/*        if (max > currentMax) {
            return max;
        } else {
            return currentMax;
        }*/
        return (max > currentMax) ? max : currentMax;

    }

    public static int findMin(int currentMin, int min) {
/*        if (min < currentMin) {
            return min;
        } else {
            return currentMin;
        }*/
        return (min < currentMin) ? min : currentMin;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet sayi girmek istiyorsunuz?");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Hatali giris!!!!");
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = scan.nextInt();

            min = findMin(currentNumber, min);
            max = findMax(currentNumber, max);
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);

    }
}
