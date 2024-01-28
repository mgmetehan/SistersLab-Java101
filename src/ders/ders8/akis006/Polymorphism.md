# Java'da Polymorphism (Cok Bicimlilik)

Polymorphism, Java'da bir nesnenin farkli turlerde davranabilme yetenegini ifade eder. Bu ozellik, programlamada kodun daha esnek ve genisletilebilir olmasini saglar. Java'da polymorphism'i anlamak icin iki onemli kavrami goz onunde bulundurmaliyiz: Method Overloading ve Method Overriding.

## 1. Method Overloading (Metot Asiri Yukleme)

Method overloading, ayni isme sahip fakat farkli parametre listelerine sahip birden fazla metot tanimlama yontemidir. Yani, ayni isme sahip metotlar farkli parametrelerle cagrilabilir. Ornek olarak:

```java
public class HesapMakinesi {

    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }
}
```

Bu durumda, `topla` metodunu hem `int` hem de `double` parametreleriyle cagirabiliriz. Java, cagrilan metoda uygun parametre listesine gore karar verir.

## 2. Method Overriding (Metot Gecersiz Kilma)

Method overriding, bir alt sinifta, ust sinifta tanimlanmis bir metodu ayni isim ve parametre listesiyle tekrar tanimlamaktir. Ornegin:

```java
public class GeometrikSekil {

    public void ciz() {
        System.out.println("Geometrik sekil ciziliyor");
    }
}

public class Dikdortgen extends GeometrikSekil {

    @Override
    public void ciz() {
        System.out.println("Dikdortgen ciziliyor");
    }
}
```

Bu ornekte, `Dikdortgen` sinifi, ust sinif olan `GeometrikSekil` sinifindaki `ciz` metodunu gecersiz kilar. Bu sayede, ayni isimle cagrilan `ciz` metodu, nesnenin turune bagli olarak farkli davranis sergiler.

## Polymorphic Davranis

Polymorphism'i daha iyi anlamak icin:

```java
// Ust sinif (base class)
class Hayvan {
    // Genel bir hayvan sesi cikarma metodu
    public void sesCikar() {
        System.out.println("Hayvan sesi cikiyor.");
    }
}

// Alt sinif (derived class) - Kedi
class Kedi extends Hayvan {
    // Ust siniftaki metodu gecersiz kilma (override)
    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }

    // Kedi sinifina ozgu bir metot
    public void tirmala() {
        System.out.println("Kedi tirmaliyor.");
    }
}

// Alt sinif (derived class) - Kopek
class Kopek extends Hayvan {
    // Ust siniftaki metodu gecersiz kilma (override)
    @Override
    public void sesCikar() {
        System.out.println("Hav hav!");
    }

    // Kopek sinifina ozgu bir metot
    public void kuyrukSalla() {
        System.out.println("Kopek kuyrugunu salliyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism ornegi
        Hayvan hayvan1 = new Kedi(); // Alt sinif referansiyla ust sinif nesnesi
        Hayvan hayvan2 = new Kopek(); // Baska bir alt sinif referansiyla ust sinif nesnesi

        // Her iki durumda da ayni metot cagrilir, ancak farkli davranislar gorulur
        hayvan1.sesCikar(); // Cikti: Miyav!
        hayvan2.sesCikar(); // Cikti: Hav hav!

        // Ozel metotlar sadece ilgili siniflara aittir
        // Bu nedenle, dogrudan Hayvan tipindeki bir referansla bu metotlari cagiramayiz
        // hayvan1.tirmala(); // Hata: 'tirmala()' Hayvan tipinde referansla cozumlenemez
        // hayvan2.kuyrukSalla(); // Hata: 'kuyrukSalla()' Hayvan tipinde referansla cozumlenemez

        // Ancak, ilgili alt sinif tipinde referanslarla ozel metotlari cagirabiliriz
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        kedi.tirmala();      // Cikti: Kedi tirmaliyor.
        kopek.kuyrukSalla(); // Cikti: Kopek kuyrugunu salliyor.
    }
}

```

## Avantajlari

1. **Esneklik (Flexibility):** Polymorphism, kodun daha esnek olmasini saglar. Ayni isme sahip metotlar, farkli nesnelerde farkli davranislari temsil edebilir. Bu sayede program, yeni ozellikler eklemek veya var olanlari degistirmek icin daha az caba harcar.

2. **Genisletilebilirlik (Extensibility):** Yeni siniflar ekleyerek veya mevcut siniflari degistirerek sistemde genisletmeler yapmak daha kolaydir. Polymorphism, kodun genisletilebilirligini artirir, cunku yeni bir alt sinif eklenerek ust sinifin metotlari gecersiz kilinabilir.

3. **Okunabilirlik (Readability):** Polymorphism, kodun daha anlasilir olmasina katki saglar. Ayni isme sahip metotlarin farkli davranislara sahip olmasi, kodun anlamini artirir. Bu durum, kodun daha kolay okunmasini ve anlasilmasini saglar.

4. **Mantenanstan Kolaylik (Ease of Maintenance):** Polymorphism, kodun bakimini kolaylastirir. Bir metodu degistirmek istediginizde, sadece ust siniftaki metodu guncellemeniz yeterlidir. Alt siniflardaki bu metotlar otomatik olarak guncellenir.

5. **Kodun Daha Az Olmasi (Less Code):** Polymorphism, ayni islevselligi paylasan kodu azaltabilir. Ayni isi yapan farkli metotlar yerine, tek bir metot kullanabilirsiniz. Bu, kodun daha kisa ve daha sade olmasini saglar.

6. **Cerceve (Framework) Kullanimi:** Polymorphism, genellikle cerceve (framework) kullaniminda yaygin olarak kullanilir. Cerceveler genellikle genis ve karmasik oldugundan, polymorphism bu tur buyuk ve genis sistemlerin yonetimini kolaylastirabilir.

Bu avantajlar, polymorphism'in yazilim gelistirme surecinde tercih edilmesini saglar. Ancak, dogru bir sekilde kullanilmasi onemlidir; aksi takdirde, gereksiz karmasikliklara neden olabilir.