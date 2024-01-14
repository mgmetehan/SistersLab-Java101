package src.ders.ders4.akis001;

public class FonksiyonlarOrnek {

    public static void selamla() {//Parametresiz ve geriye deger donmeyen
        System.out.println("Selamlar hos geldinizzzz!");
        System.out.println("Naber");
        System.out.println("Iyi gunler");
    }


    public static void selamlaNew(String name) {//Parametreli ve geriye deger dondurmeyen
        System.out.println("Selamlar " + name);
    }

    public static void selamlaNew2(String name, int odaNo, int katNo, char blokNo) {//Parametreli ve geriye deger dondurmeyen
        System.out.println("Selamlar " + name + " odanizin numarasi: " + odaNo + " odanizin kat numarasi: "
                + katNo + " Odanizin blok numarasi: " + blokNo);
    }

    public static int sum(int number1, int number2) {//parametreli ve Geriye deger donen
        int toplam = number1 + number2;
        return toplam; // return number1 + number2;
    }


    public static void main(String[] args) {
/*        selamla();
        selamla();
        selamla();
        selamla();*/

/*        String name = "Melisa";
        selamlaNew(name);

        selamlaNew("Fatih");*/

/*
        selamlaNew2("Alperen", 704, 7, 'A');
        selamlaNew2("Alperen2", 702, 7, 'B');*/

        int result = sum(8, 15);
        System.out.println(result);

        System.out.println(sum(77, 23));

    }
}
