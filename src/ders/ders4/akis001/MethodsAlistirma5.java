package src.ders.ders4.akis001;

import java.util.Scanner;

public class MethodsAlistirma5 {
    //Recursive Metotlar ile ?sl? Say? Hesaplama

    public static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Taban degeri girinz: ");
        int taban = scan.nextInt();

        System.out.println("Us degeri girinz: ");
        int us = scan.nextInt();


        System.out.println(taban + " ^ " + us + "=" + usHesapla(taban, us));


    }

}
