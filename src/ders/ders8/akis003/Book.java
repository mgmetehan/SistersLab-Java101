package src.ders.ders8.akis003;

public class Book {
    private String name;
    private int sayfaSayisi;


    public void degeriBurdanDegistir(int sayfa) {
        if (sayfa > 0) {
            this.sayfaSayisi = sayfa;
        } else {
            this.sayfaSayisi = 0;
        }
    }

    public Book(String name, int sayfaSayisi) {
        if (sayfaSayisi > 0) {
            this.sayfaSayisi = sayfaSayisi;
        } else {
            this.sayfaSayisi = 0;
        }

        this.name = name;
    }

    public Book() {
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        if (sayfaSayisi > 0) {
            this.sayfaSayisi = sayfaSayisi;
        } else {
            this.sayfaSayisi = 0;
        }
    }
}
