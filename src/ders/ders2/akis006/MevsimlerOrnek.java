package src.ders.ders2.akis006;

import java.util.Scanner;

public class MevsimlerOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen hangi ay preiyodunda oldugunuzu belirtiniz!");
        System.out.println("1,2,3,4\n");
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Su an Kis ayindayiz. Ocak,subat,mart");
                break;
            case 2:
                System.out.println("Su an Ilkbahar ayindayiz. nisan,mayis,haziran");
                break;
            case 4:
                System.out.println("Su an Sonbahar ayindayiz. ekim,kasim,aralik");
                break;
            case 3:
                System.out.println("Su an Yaz ayindayiz. Temmuz,agustos,eylul");
                break;
            default:
                System.out.println("Hatali deger girdiniz!!!");
        }


    }
}
