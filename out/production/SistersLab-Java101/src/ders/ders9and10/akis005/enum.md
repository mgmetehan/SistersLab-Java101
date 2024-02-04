# Java Enum Siniflari - Bootcamp Dokumantasyonu

## Giris

Bu dokumantasyon, Java programlama dilindeki `enum` siniflarini anlatmaktadir. `enum` siniflari, belirli bir turdeki sinirli ve onceden tanimlanmis degerleri temsil etmek icin kullanilir. Bu siniflar, ozellikle belirli sabit degerleri ifade etmek ve kodu daha anlasilir ve bakimi kolay hale getirmek icin kullanislidir.

## Enum Sinifi Nedir?

`enum`, Enumeration kisaltmasidir ve bir turdur. Bu tur, bir dizi onceden tanimlanmis sabit degeri icerir. Enum siniflari, genellikle bir nesnenin belirli durumlarini veya turlerini temsil etmek icin kullanilir.

```java
public enum Renk {
    KIRMIZI,
    MAVI,
    YESIL,
    SARI,
    TURUNCU
}
```

Yukaridaki ornek, `Renk` adli bir enum sinifini tanimlar ve bu sinifin sabit degerleri `KIRMIZI`, `MAVI`, `YESIL`, `SARI` ve `TURUNCU`'dur.

## Enum Sabit Degerlerine Erisim

Enum siniflarindaki sabit degerlere erismek icin, enum turundeki bir degisken olusturabilir ve ardindan bu degisken uzerinden sabit degerlere erisebilirsiniz.

```java
Renk favoriRenk = Renk.MAVI;
System.out.println("Favori renginiz: " + favoriRenk);
```

Bu ornekte, `Renk` enum sinifindan bir ornek olusturulmus ve bu ornegin degeri `MAVI` olarak atanmistir.

## Switch Ifadeleri ile Kullanim

Enum siniflari, genellikle switch ifadeleri ile birlikte kullanilir. Bu, kodun daha okunabilir olmasina ve hata yapma olasiliginin azalmasina yardimci olur.

```java
switch (favoriRenk) {
    case KIRMIZI:
        System.out.println("Tutkulu bir renk sectiniz!");
        break;
    case MAVI:
        System.out.println("Dingin ve serin bir renk sectiniz.");
        break;
    case YESIL:
        System.out.println("Dogayi seven birisiniz!");
        break;
    default:
        System.out.println("Diger renkler de guzeldir!");
}
```

Switch ifadesi, enum sabit degerlerini kontrol etmek ve buna gore islem yapmak icin kullanilir. Bu, kodunuzun daha duzenli ve anlasilir olmasina yardimci olur.

## Enum Siniflarinin Avantajlari

- **Kodun Anlasilabilirligi:** Enum siniflari, belirli sabit degerleri temsil ettigi icin kodun anlasilabilirligini artirir.
- **Hata Kontrolu:** Enum siniflari, tanimlanan sabit degerler disinda bir deger alirsa derleme zamaninda hata verir, bu da programin daha guvenli olmasini saglar.
- **Duzen ve Bakim Kolayligi:** Enum siniflari, belirli sabit degerlere sahip oldugu icin kodu duzenlemek ve bakim yapmak daha kolaydir.

## Sonuc

Java'daki enum siniflari, belirli sabit degerleri temsil etmek icin guclu bir aractir. Bu siniflar, kodun okunabilirligini artirir, hata olasiligini azaltir ve programin daha guvenli hale gelmesine yardimci olur. Bu dokumantasyon, enum siniflarini anlamaniza ve etkili bir sekilde kullanmaniza yardimci olacaktir.

--- 

```java
public class EnumOrnek {

    // Enum sinifi olusturma
    public enum HaftaGunleri {
        PAZAR(1),
        PAZARTESI(2),
        SALI(3),
        CARSAMBA(4),
        PERSEMBE(5),
        CUMA(6),
        CUMARTESI(7);

        // Enum sabitlerine atanan sayisal deger
        private final int gunKodu;

        // Enum sabitlerine deger atama
        HaftaGunleri(int gunKodu) {
            this.gunKodu = gunKodu;
        }

        // Enum sabitlerinin sayisal degerini getirme metodu
        public int getGunKodu() {
            return gunKodu;
        }
    }

    public static void main(String[] args) {
        // Enum sabitlerine erisim ve sayisal degerlerini alma
        System.out.println("Pazartesi'nin gun kodu: " + HaftaGunleri.PAZARTESI.getGunKodu());
        System.out.println("Cuma'nin gun kodu: " + HaftaGunleri.CUMA.getGunKodu());
        System.out.println("Cumartesi'nin gun kodu: " + HaftaGunleri.CUMARTESI.getGunKodu());
    }
}
```
