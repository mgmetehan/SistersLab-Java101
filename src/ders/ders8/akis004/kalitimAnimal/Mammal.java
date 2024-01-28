package src.ders.ders8.akis004.kalitimAnimal;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    public void giveBirth(){
        System.out.println(getName() + " dogum yapiyor.");
    }
}
