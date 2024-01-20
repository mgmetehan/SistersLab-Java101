package src.ders.ders5.akis002;

public class CokBoyutluArrayAlistirma {
/*
    public static void main(String[] args) {
        //Matris Elemanlarini Toplama
        int[][] matris = {
                {1, 2, 3, 4},
                {1, 1, 1, 1},
                {3, 3, 3, 0}
        };
        matrisToplam(matris);

    }

    public static void matrisToplam(int[][] matris) {
        int toplam = 0;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                toplam += matris[i][j];
            }
        }
        System.out.println("Toplam: " + toplam);
    }
*/

    /*    public static void main(String[] args) {
     *//*        String[] str= new String[3];

        str[0]="kalem";
        str[1]= "defter";

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);*//*

     *//*        double[] str= new double[3];

        str[0]=1;
        str[1]= 3;

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);*//*

    }*/

/*    public static void main(String[] args) {
        //Dongu ile Matris Olusturma
        int[][] matris = new int[3][3];

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                matris[satir][sutun] = satir + sutun;
            }
        }

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(matris[satir][sutun]+ " ");
            }
            System.out.println();
        }
    }*/

/*    public static void main(String[] args) {
        //Iki Matris Toplama
        int[][] matris1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matris2 = {
                {3, 3, 3},
                {6, 7, 2},
                {9, 11, 7}
        };

        int[][] toplamMatris = new int[3][3];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(toplamMatris[i][j] + " ");
            }
            System.out.println();
        }
    }*/

/*    public static void main(String[] args) {
        //Satir ve Sutun Toplamini Bulma
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 8, 9}
        };

        int[] satirToplam = new int[matris.length];
        int[] sutunToplam = new int[matris[0].length];

        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[0].length; column++) {
                satirToplam[row] = satirToplam[row] + matris[row][column];
                sutunToplam[column] = sutunToplam[column] + matris[row][column];
            }
        }

        System.out.println("Satir toplami");
        for (int i = 0; i < satirToplam.length; i++) {
            System.out.println("Satir " + i + ": " + satirToplam[i]);
        }

        System.out.println("Sutun Toplami");
        for (int i = 0; i < sutunToplam.length; i++) {
            System.out.println("Sutun " + i + ": " + sutunToplam[i]);
        }


    }*/


}
