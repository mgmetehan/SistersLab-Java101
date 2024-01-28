package src.ders.ders8.akis004.kalitimAnimal;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(getName()+ " ucuyor.");
    }
}
