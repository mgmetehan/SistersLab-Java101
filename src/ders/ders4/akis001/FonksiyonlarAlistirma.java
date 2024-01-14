package src.ders.ders4.akis001;

public class FonksiyonlarAlistirma {

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        return null;
    }

    public static String fizz(int number) {
        if (number % 3 == 0) {
            String result = "Fuzz";
            return result;
        }
        return null;
    }


    public static String buzz(int number) {
        if (number % 5 == 0) {
            String result = "Buzz";
            return result;
        }
        return null;
    }

    public static void main(String[] args) {

/*        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }*/

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
            System.out.println(fizz(i));
            System.out.println(buzz(i));
        }
    }
}
