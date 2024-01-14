package src.ders.ders4.akis001;

public class RecursiveFaktoriyel {


    public static int faktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
 /*           faktoriyel(5) = 5 * faktoriyel(4)(24);
            faktoriyel(4) = 4 * faktoriyel(3)(6);
            faktoriyel(3) = 3 * faktoriyel(2)(2);
            faktoriyel(2) = 2 * faktoriyel(1)(1);
            faktoriyel(1) = 1*/
        }
    }


    public static void main(String[] args) {

/*        int faktoriyel = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        System.out.println(faktoriyel);*/

        int number = 5;
        int result = faktoriyel(number);
        System.out.println(number + "! sonucu: " + result);

    }

}
