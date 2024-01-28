package src.ders.ders8.akis003;

public class EncapsulationOrnek {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", 100);
        Book b2 = new Book("Book2", 1000);
        Book b3 = new Book("Book3", -100);

        System.out.println(b1.getName() + " " + b1.getSayfaSayisi());
        System.out.println(b3.getName() + " " + b3.getSayfaSayisi());
        b3.setSayfaSayisi(-200);
        System.out.println(b3.getName() + " " + b3.getSayfaSayisi());

    }
}
