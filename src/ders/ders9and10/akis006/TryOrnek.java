package src.ders.ders9and10.akis006;

import java.util.ArrayList;
import java.util.List;

public class TryOrnek {
    public static void main(String[] args) {
/*        int sayi1 = 10;
        int sayi2 = 0;

        if (sayi2 == 0) {
            System.out.println("Bir sayi 0 bolunemez!!!!");
        }

        System.out.println(sayi1 / sayi2);
        System.out.println("Ben yasiyor muyum");*/


/*        try {
            int sayi1 = 10;
            int sayi2 = 0;
            System.out.println(sayi1 / sayi2);
        } catch (Exception e) {
            System.out.println("Ben sana sifira bolme demedim mi!!!" + e);
        }

        System.out.println("Ben yasiyor muyum");*/

        try {
            int[] list = new int[1];
            //System.out.println(list[2]);
            System.out.println(list[0]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Senin listen o mu!!!!!!!"+ e);
        }finally {
            System.out.println("Burasi her zaman calisir!");
        }

        try {
            int sayi1 = 10;
            int sayi2 = 0;
            System.out.println(sayi1 / sayi2);
        } catch (Exception e) {
            System.out.println("Ben sana sifira bolme demedim mi!!!" + e);
        }

        System.out.println("Ben yasiyor muyum");

    }
}
