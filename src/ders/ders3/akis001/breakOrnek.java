package src.ders.ders3.akis001;

public class breakOrnek {

    public static void main(String[] args) {
/*        for (int i = 0; i < 5; i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("------");

        for (int i = 0; i < 5; i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }*/


/*        int i = 0;
        for (; i < 5; ) {
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }*/


  /*      //!Soru: 1'den 100'e kadar olan sayilarin toplamini bulma (5 ve 7'ye bolunebilenleri atlayarak).
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
                continue;
            } else {
                toplam += i;
            }
        }
        System.out.println("Toplam: " + toplam);*/


        //?Soru: 1'den 100'e kadar olan asal sayilari bulun ve ekrana yazdirin.
        boolean asalMi = true;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi && i != 1) {
                System.out.println(i);
            }
            asalMi = true;
        }

    }
}
