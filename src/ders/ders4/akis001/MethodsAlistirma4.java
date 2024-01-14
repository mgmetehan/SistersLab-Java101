package src.ders.ders4.akis001;

import java.util.Scanner;

public class MethodsAlistirma4 {
    // girilen sayinin basamak sayisini ve basamaklarinin toplamini yazsin

    public static int calculateDigitSum(int num) { //basamaklar toplamini bulur
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int calculateDigitCount(int num) { //basamak sayisini bulur
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int digitSum = calculateDigitSum(num);
        System.out.println("Basamklar toplami: " + digitSum);
        int digitCount = calculateDigitCount(num);
        System.out.println("Basamak sayisi: " + digitCount);
    }


}
