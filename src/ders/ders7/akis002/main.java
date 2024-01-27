package src.ders.ders7.akis002;

public class main {
    public static void main(String[] args) {
        Product laptop = new Product("M3 mac",70000,10,2022);
        laptop.stockKontrol();
        System.out.println(laptop.kdvHesapla());
        System.out.println(laptop.indirim());
        System.out.println(laptop.toString());

        laptop.setStock(0);
        laptop.stockKontrol();


    }
}
