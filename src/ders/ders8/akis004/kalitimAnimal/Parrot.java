package src.ders.ders8.akis004.kalitimAnimal;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void mimic() {
        System.out.println(getName() + " taklit yapiyor.");
    }
}
