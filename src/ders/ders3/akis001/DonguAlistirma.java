package src.ders.ders3.akis001;

public class DonguAlistirma {
    public static void main(String[] args) {
        //1 ile 100 aras?ndaki say?lar? ekrana yazd?ran bir Java program? yaz?n. Ancak, program?n ??kt?s?nda. 3 bolunenler yerine  "Fizz" yazin. 5 bolunenler yerine "Buzz"yazin
        // E?er say? hem 3 hem de 5'in kat?ysa "FizzBuzz" yazs?n.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }


    }
}
