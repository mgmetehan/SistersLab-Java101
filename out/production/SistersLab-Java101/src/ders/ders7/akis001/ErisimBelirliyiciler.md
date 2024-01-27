# Erisim Belirleyiciler (Access Modifiers) incelemesi

Java programlama dilinde, siniflar, degiskenler, metotlar ve diger uyelerin erisim duzeyini kontrol etmek icin erisim belirleyiciler kullanilir. Erisim belirleyiciler, bir uyenin hangi kod bloklarindan veya siniflardan erisilebilecegini belirler ve Java'da dort ana erisim belirleyici bulunur.

## 1. Public (Genel)

`public` erisim belirleyicisi, bir uyenin herkes tarafindan erisilebilir oldugunu gosterir. Bu, uyenin paket icindeki ve paket disindaki her yerde kullanilabilir oldugu anlamina gelir.

```java
public class Ogrenci {
    public String ad;
    public int yas;
    
    public void selamVer() {
        System.out.println("Merhaba!");
    }
}
```

Yukaridaki ornekte, `Ogrenci` sinifinin `ad` ve `yas` degiskenleri ile `selamVer` metodu `public` olarak belirlenmistir.

## 2. Private (Ozel)

`private` erisim belirleyicisi, bir uyenin sadece ayni sinifta erisilebilir oldugunu gosterir. Bu, uyenin sinif disindaki kodlardan gizli oldugu anlamina gelir.

```java
public class Hesap {
    private double bakiye;
    
    private void bakiyeGuncelle(double miktar) {
        this.bakiye += miktar;
    }
}
```

Yukaridaki ornekte, `Hesap` sinifinin `bakiye` degiskeni ve `bakiyeGuncelle` metodu `private` olarak belirlenmistir.

## 3. Protected (Korumali)

`protected` erisim belirleyicisi, bir uyenin sadece ayni paketteki veya bu uyenin alt siniflarindaki siniflardan erisilebilir oldugunu gosterir.

```java
public class Personel {
    protected String ad;
    
    protected void bilgiGoster() {
        System.out.println("Personel adi: " + ad);
    }
}
```

Yukaridaki ornekte, `Personel` sinifinin `ad` degiskeni ve `bilgiGoster` metodu `protected` olarak belirlenmistir.

## 4. Default (Package-Private)

Eger bir uyenin erisim belirleyicisi belirtilmemisse, varsayilan olarak bu uye, ayni paketteki diger siniflardan erisilebilir, ancak paket disindaki siniflardan erisilemez.

```java
class Calisan {
    String pozisyon;
    
    void pozisyonBelirle(String yeniPozisyon) {
        this.pozisyon = yeniPozisyon;
    }
}
```

Yukaridaki ornekte, `Calisan` sinifinin `pozisyon` degiskeni ve `pozisyonBelirle` metodu erisim belirleyicisi belirtilmemis, yani varsayilan olarak paket icindeki siniflardan erisilebilirdir.

Erisim belirleyiciler, Java'da siniflarin ve nesnelerin kontrolsuz bir sekilde birbirleriyle etkilesimini onleyerek guvenli ve duzenli bir kod yapisi olusturmayi saglar. Erisim kontrolu, yazilim projelerinin surdurulebilirligini ve bakimini artirabilir.