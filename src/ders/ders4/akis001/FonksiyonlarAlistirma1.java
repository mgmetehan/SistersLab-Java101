package src.ders.ders4.akis001;

public class FonksiyonlarAlistirma1 {

    public static void checkAge(int age){
        if (age>18){
            System.out.println("Partiye Hos geldinizz");
        }else if(age == 18){
            System.out.println("Tek basina giremezsinn!");
        }else {
            System.out.println("Gorusurz!");
        }
    }


    public static void main(String[] args) {
        checkAge(18);
        checkAge(21);

    }

}
