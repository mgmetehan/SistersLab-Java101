package src.ders.ders8.akis006;

public class PolymorphismOrnek {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sesCikar();

        Kedi kedi = new Kedi();
        kedi.sesCikar();
        kedi.tirmala();

        Kopek kopek = new Kopek();
        kopek.sesCikar();
        kopek.kuyrukSalla();

    }
}
