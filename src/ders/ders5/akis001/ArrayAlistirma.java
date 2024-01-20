package src.ders.ders5.akis001;

import java.util.Scanner;

public class ArrayAlistirma {
/*    public static void main(String[] args) {
        // Dizi Elemanlarini Toplama
        int[] numbers = {15, 20, 8, 40};
        int sum = countSum(numbers);
        System.out.println(sum);
    }

    public static int countSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }*/

/*    public static void main(String[] args) {
        //En Buyuk Elemani Bulma
        int[] numbers = {1, 5, 7, 2, 9, 0, 12, 5, 80};
        int maxNumber = findMax(numbers);
        System.out.println(maxNumber);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }*/


/*    public static void main(String[] args) {
        // Cift Sayilari Bulma
        int[] numbers= {1,2,34,656,73,7,0,9,22};
        ciftSayilar(numbers);
    }

    public static void ciftSayilar(int[] array){
        for (int i =0; i<array.length;i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }*/

/*    public static void main(String[] args) {
        //Bir Sayiyi Dizide Arama
        int[] numbers = {1, 2, 34, 656, 73, 7, 0, 9, 22};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aranacak sayiyi giriniz:");
        int sayi1 = scan.nextInt();

        boolean sayiyiBuldunMu = sayiyiBul(numbers, sayi1);
        if (sayiyiBuldunMu) {
            System.out.println("Aradiginiz sayiyi listede buldum");
        } else {
            System.out.println("Aradiginiz sayiyi listede bulunmuyor!!!");
        }
    }

    public static boolean sayiyiBul(int[] arr, int sayi) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                return true;
            }
        }
        return false;
    }*/

/*    public static void main(String[] args) {
        //Dizi Elemanlarini Ters Cevirme
        int[] numbers = {1, 2, 34, 656, 73, 7, 0, 9, 22};
        reverseNumbers(numbers);
    }

    public static void reverseNumbers(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/

/*    public static void main(String[] args) {
        //!Ortalama Hesaplama
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(toplam(numbers));
    }

    public static double toplam(int[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam / arr.length;
    }*/

/*    public static void main(String[] args) {
        //Dizi Elemanlarini Kopyalama
        int[] numbers = {10, 20, 30, 40, 50};
        int[] copyofNumbers = copy(numbers);

        print(numbers);
        System.out.println("--------------");
        print(copyofNumbers);

    }

    public static int[] copy(int[] arr) {
        int[] copyList = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyList[i] = arr[i];
        }
        return copyList;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/

/*    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < 7; i++) {
            System.out.println(numbers[i]);
        }

    }*/

    public static void main(String[] args) {
        // Fibonacci Dizisi
        // 0 1 1 2 3 5 8 13 21 34
        int n = 10;
        int[] fibonacci = fibonacci(10);
        print(fibonacci);

    }

    public static int[] fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;

    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }


}
