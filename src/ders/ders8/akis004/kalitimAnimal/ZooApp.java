package src.ders.ders8.akis004.kalitimAnimal;

public class ZooApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Karabas");
        dog1.bark();
        dog1.giveBirth();
        dog1.eat();

        Parrot parrot1 = new Parrot("Rio");
        parrot1.mimic();
        parrot1.fly();
        parrot1.eat();

    }
}
