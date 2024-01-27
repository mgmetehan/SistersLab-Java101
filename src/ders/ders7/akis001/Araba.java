package src.ders.ders7.akis001;

public class Araba {
    String renk;
    String model;
    int hiz;

/*    Araba() {
        renk = "Beyaz";
        model = "Sedan";
        hiz = 0;
    }

    Araba(String yeniRenk, String yeniModel, int yeniHiz) {
        renk = yeniRenk;
        model = yeniModel;
        hiz = yeniHiz;
    }*/

    public Araba(String renk, String model, int hiz) {
        this.renk = renk;
        this.model = model;
        this.hiz = hiz;
    }

    void hizlan(int artis) {
        hiz += artis;
    }

    void yavasla(int azalis) {
        hiz -= azalis;
    }
}
