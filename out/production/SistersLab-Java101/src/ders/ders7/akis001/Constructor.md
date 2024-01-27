# Constructor (Yapici) Metot Kullanimi

Java programlamada, bir sinifin nesnesi olusturuldugunda otomatik olarak cagrilan ozel bir metot vardir. Bu metoda "Constructor" veya "Yapici Metot" denir. Constructor, bir nesnenin baslatilmasi icin kullanilir ve genellikle sinifin ozelliklerini baslangic degerleriyle doldurur.

## Temel Constructor Kullanimi

```java
class Araba {
    String renk;
    String model;
    int hiz;
    
    // Parametre almayan yapici metot (default constructor)
    Araba() {
        renk = "Beyaz";
        model = "Sedan";
        hiz = 0;
    }
    
    // Parametre alan yapici metot
    Araba(String yeniRenk, String yeniModel, int yeniHiz) {
        renk = yeniRenk;
        model = yeniModel;
        hiz = yeniHiz;
    }
}

public class ArabaProgrami {
    public static void main(String[] args) {
        // Parametre almayan constructor kullanimi
        Araba araba1 = new Araba();
        
        // Parametre alan constructor kullanimi
        Araba araba2 = new Araba("Kirmizi", "SUV", 80);
    }
}
```

Yukaridaki ornekte, `Araba` sinifinin icinde iki adet constructor tanimlanmistir. Ilki parametre almayan ve default degerlerle baslangic degerlerini atayan bir constructor'dir. Ikincisi ise parametre alan bir constructor'dir. Bu sayede nesne olusturulurken baslangic degerleri belirtilebilir.

## Ozel Constructor Kullanimi

```java
class Kullanici {
    String kullaniciAdi;
    String sifre;
    
    // Parametre alan constructor
    Kullanici(String ad, String sifre) {
        kullaniciAdi = ad;
        this.sifre = sifre;
    }
    
    // Parametre almayan constructor
    Kullanici() {
        kullaniciAdi = "Misafir";
        sifre = "1234";
    }
}

public class KullaniciProgrami {
    public static void main(String[] args) {
        // Kullanici adi ve sifre belirtilen constructor kullanimi
        Kullanici kullanici1 = new Kullanici("ahmet", "ahmet123");
        
        // Parametre almayan constructor kullanimi
        Kullanici kullanici2 = new Kullanici();
    }
}
```

Bu ornekte, `Kullanici` sinifinda iki farkli constructor tanimlanmistir. Birincisi kullanici adi ve sifre parametrelerini alan bir constructor, ikincisi ise parametre almayan bir constructor'dir. Ikinci constructor, kullanici adini "Misafir" ve sifreyi "1234" olarak varsayilan degerlerle baslatir.

Constructor'lar, siniflarin nesnelerini olustururken baslangic durumunu belirlemek ve sinifin baslatilmasini kontrol etmek icin guclu bir aractir. Iyi tasarlanmis bir constructor, nesnenin kullandigi bellegi baslatma, baglantilari kurma ve diger baslangic islemlerini gerceklestirmek icin kullanilir.