# Java'da Abstraction (Soyutlama)

## Giris

Abstraction (soyutlama), nesne yonelimli programlamada onemli bir prensiptir. Bu prensip, karmasik bir sistemi basitlestirmek, kullaniciya sadece gerekli olan ozellikleri ve davranislari sunmak icin kullanilir. Java'da soyutlama, `abstract` siniflar ve `interface`'ler araciligiyla gerceklestirilir.

## Abstract Siniflar

Abstract siniflar, soyutlama ilkesini uygulamanin bir yoludur. Abstract siniflar, hem somut (concrete) metotlar icerebilir hem de soyut (abstract) metotlara sahip olabilir. Soyut metotlar, sadece imza (signature) ile tanimlanir ve alt siniflar tarafindan uygulanmasi gerekir.

### Abstract Sinif Ornegi

```java
// Abstract sinif
abstract class Sekil {
    // Somut metot
    void mesajGoster() {
        System.out.println("Bu bir sekildir.");
    }

    // Soyut metot
    abstract void ciz();
}

// Abstract sinifi genisleten bir alt sinif
class Dikdortgen extends Sekil {
    // Soyut metodu implemente etme
    @Override
    void ciz() {
        System.out.println("Dikdortgen ciz");
    }
}

// Kullanim ornegi
public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.mesajGoster(); // Bu bir sekildir.
        dikdortgen.ciz();         // Dikdortgen ciz
    }
}
```

Yukaridaki ornekte, `Sekil` adinda bir abstract sinif tanimlanmistir. Bu sinif, somut bir metot (`mesajGoster`) ve soyut bir metot (`ciz`) icermektedir. `Dikdortgen` sinifi, `Sekil` sinifindan turetilmis ve soyut metodu implemente etmistir.

## Interface

Java'da interface, bir sinifin uygulamasi gereken metotlari ve davranislari tanimlayan bir yapidir. Interface icindeki metotlar sadece imza ile tanimlanir ve implement edilecek siniflar bu metotlari icermek zorundadir.

### Interface Ornegi

```java
// Interface tanimi
interface Sekil {
    // Metot imzalari
    void ciz();
    double alanHesapla();
}

// Interface'i implemente eden bir sinif
class Dikdortgen implements Sekil {
    // Metotlari implement etme
    @Override
    public void ciz() {
        System.out.println("Dikdortgen ciz");
    }

    @Override
    public double alanHesapla() {
        return 0; // Dikdortgenin alan hesaplamasi burada implement edilebilir
    }
}

// Kullanim ornegi
public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.ciz();           // Dikdortgen ciz
        double alan = dikdortgen.alanHesapla(); // Alan hesapla
    }
}
```

Yukaridaki ornekte, `Sekil` adinda bir interface tanimlanmistir. Bu interface, `ciz` ve `alanHesapla` metotlarini icermektedir. `Dikdortgen` sinifi, bu interface'i implement etmis ve belirtilen metotlari icermistir.

## Abstract Siniflar ile Interface Arasindaki Farklar

1. **Soyut Metotlarin Sayisi:**
    - Abstract siniflar, hem soyut hem de somut metotlari icerebilir.
    - Interface'ler sadece soyut metotlari icerebilir.

2. **Constructors (Yapicilar):**
    - Abstract siniflar kendi yapicilarina sahip olabilir.
    - Interface'lerin kendi yapicilari yoktur.

3. **Coklu Miras:**
    - Bir sinif yalnizca bir abstract sinifi genisletebilirken, birden fazla interface'i implement edebilir.

4. **Variables (Degiskenler):**
    - Abstract siniflar, instance variables (ornek degiskenleri) ve class variables (sinif degiskenleri) icerebilir.
    - Interface'ler sadece public static final (sabit) degiskenleri icerebilir.

Abstract siniflar ve interface'ler, Java'da soyutlama ilkesini kullanmanin iki farkli yolunu sunarlar. Hangi yapinin kullanilacagi, projenin ihtiyaclarina ve tasarim prensiplerine baglidir.

```java
// Abstract sinif tanimi
abstract class MuzikEnstrumani {
    private String marka;
    private String model;

    // Constructor
    public MuzikEnstrumani(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    // Abstract metotlar
    abstract void cal(); // Enstrumanin calma islemi

    // Somut metotlar
    void bilgiGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
    }
}

// Abstract sinifi genisleten bir alt sinif
class Piyano extends MuzikEnstrumani {
    private int tusSayisi;

    // Constructor
    public Piyano(String marka, String model, int tusSayisi) {
        super(marka, model);
        this.tusSayisi = tusSayisi;
    }

    // Abstract metotlari implement etme
    @Override
    void cal() {
        System.out.println("Piyano caliniyor...");
    }

    // Piyano'ya ozel metot
    void tusSayisiniGoster() {
        System.out.println("Tus Sayisi: " + tusSayisi);
    }
}

// Abstract sinifi genisleten baska bir alt sinif
class Gitar extends MuzikEnstrumani {
    private int telSayisi;

    // Constructor
    public Gitar(String marka, String model, int telSayisi) {
        super(marka, model);
        this.telSayisi = telSayisi;
    }

    // Abstract metotlari implement etme
    @Override
    void cal() {
        System.out.println("Gitar caliniyor...");
    }

    // Gitar'a ozel metot
    void telSayisiniGoster() {
        System.out.println("Tel Sayisi: " + telSayisi);
    }
}

// Kullanim ornegi
public class Main {
    public static void main(String[] args) {
        Piyano piyano = new Piyano("Yamaha", "Grand Piano", 88);
        Gitar gitar = new Gitar("Fender", "Stratocaster", 6);

        // Abstract siniftan miras alinan metotlar
        piyano.bilgiGoster();
        piyano.cal();
        piyano.tusSayisiniGoster();

        System.out.println();

        gitar.bilgiGoster();
        gitar.cal();
        gitar.telSayisiniGoster();
    }
}
```