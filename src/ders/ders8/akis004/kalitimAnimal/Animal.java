package src.ders.ders8.akis004.kalitimAnimal;

public class Animal {
    private String name;

    public void eat() {
        System.out.println(name + " yemek yiyor.");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
