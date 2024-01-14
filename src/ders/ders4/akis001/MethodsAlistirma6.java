package src.ders.ders4.akis001;

public class MethodsAlistirma6 {

    //Arnan Harf Say?s?n? Hesaplayan Metod:

    public static int harfSayisiBul(String cumle, char c) {
        int counter = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String cumle = "SistersLAb Java Akedemisi";
        char arananHarf = 'a';

        int sayac = harfSayisiBul(cumle, arananHarf);
        System.out.println(cumle + " icerisinde " + sayac + " tane " + arananHarf + " bulunuyor.");


        arananHarf = 'i';

        sayac = harfSayisiBul(cumle, arananHarf);
        System.out.println(cumle + " icerisinde " + sayac + " tane " + arananHarf + " bulunuyor.");
    }


}
