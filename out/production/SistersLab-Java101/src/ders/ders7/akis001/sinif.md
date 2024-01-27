# Sinif (Class) Nedir?

Sinif, benzer ozelliklere sahip nesnelerin bir sablonunu tanimlayan bir programlama terimidir. Bir sinif, nesnelerin ortak ozelliklerini (veri alanlari) ve davranislarini (metodlar) icerir. Siniflar, programcilara bir nesnenin nasil olusturulacagini ve kullanilacagini belirleyen bir tasarim sunar.

Siniflara ait nitelikler ve davranislar vardir. Programlamada nitelikler icin degiskenler (variable) ,davranislar icin ise metotlar (method) tanimlanir.

### Sinifin Temel Bilesenleri

1. **Veri Alanlari (Ozellikler):** Bir sinif, nesnelerin tasiyacagi verileri tanimlayan veri alanlari icerir. Ornegin, bir "Araba" sinifinda renk, model, hiz gibi ozellikler veri alanlari olabilir.

```java
class Araba {
    String renk;
    String model;
    int hiz;
}
```

2. **Metodlar (Davranislar):** Bir sinif, nesnelerin gerceklestirebilecegi islemleri tanimlayan metotlari icerir. Ornegin, bir "Araba" sinifinda "hizlan", "yavasla" gibi davranislari ifade eden metotlar bulunabilir.

```java
class Araba {
    // (Onceki tanimlar)
    
    void hizlan(int artis) {
        hiz += artis;
    }
    
    void yavasla(int azalis) {
        hiz -= azalis;
    }
}
```

## Sinifin Kullanimi

Siniflari kullanmak, nesneleri olusturmak ve bu nesneler uzerinde islemler gerceklestirmek anlamina gelir. Bir siniftan bir nesne olusturmak, o sinifin bir ornegini yaratmak demektir.

```java
public class ArabaProgrami {
    public static void main(String[] args) {
        // Araba sinifindan iki ornek (nesne) olusturuluyor
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();
        
        // Araba nesnelerinin ozelliklerine deger ataniyor
        araba1.renk = "Kirmizi";
        araba1.model = "Sedan";
        araba1.hiz = 60;
        
        araba2.renk = "Mavi";
        araba2.model = "SUV";
        araba2.hiz = 80;
        
        // Araba nesnelerinin davranislari cagriliyor
        araba1.hizlan(10);
        araba2.yavasla(5);
    }
}
```

Bu ornek, "Araba" sinifindan iki adet araba nesnesi olusturur, ozelliklerine deger atar ve bu nesnelerin davranislarini cagirarak bir programi simgeler.

Siniflar, programlamada kodun duzenlenmesini, bakimini kolaylastirir ve nesne yonelimli programlamanin temelini olusturur.