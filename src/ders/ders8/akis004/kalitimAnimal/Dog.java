package src.ders.ders8.akis004.kalitimAnimal;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " woof woof diyor.");
    }
}
