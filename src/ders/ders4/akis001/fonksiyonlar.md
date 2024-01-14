## Metotlar (Fonksiyonlar)

Java programlamada metotlar, belirli bir gorevi yerine getiren, bagimsiz birimlerdir. Metotlar sayesinde kodunuz daha moduler, anlasilir ve tekrar kullanilabilir hale gelir.

**Neden Metot Kullaniriz?**

Metotlar, programlamada kodunuzu daha duzenli ve etkili bir sekilde yonetmenin birkac avantajini saglar:

1. **Modulerlik ve Duzen:**
    - Metotlar, kodu kucuk, bagimsiz bloklara ayirmaniza olanak tanir. Her bir metot, belirli bir gorevi yerine getirir.
    - Kodunuz daha moduler hale gelir, boylece her metot belirli bir islevi yerine getirir ve kodunuzun genel mantigini daha iyi anlamaniz kolaylasir.

2. **Tekrar Kullanilabilirlik:**
    - Bir metodu bir kez tanimlayarak, bu metodu programin farkli yerlerinde tekrar tekrar kullanabilirsiniz. Bu, ayni kodu tekrar yazmak yerine daha etkili bir sekilde calismanizi saglar.
    - Kodunuzda degisiklik yapmaniz gerektiginde, sadece bir metodu guncellemeniz yeterli olacaktir.

3. **Bakim Kolayligi:**
    - Metotlar, kodunuzdaki hatalari izole etmenizi saglar. Bir metottaki hata sadece o metodu etkiler, diger metotlar etkilenmez.
    - Kodunuzu daha bakimi kolay hale getirir cunku degisiklikler sadece ilgili metodu etkiler.

4. **Kod Tekrarinin Azaltilmasi:**
    - Ayni islevselligi yerine getiren kodu tekrar tekrar yazmak yerine, bu islevselligi bir metot icinde tanimlayabilirsiniz. Bu, kodunuzun daha az yazilmasini ve daha az hata icermesini saglar.

5. **Kodun Anlasilabilirligi:**
    - Metotlar, belirli bir islemi ifade eden isimlendirilmis bloklardir. Bu, kodunuzu daha aciklayici hale getirir ve baskalarinin veya sizin kodunuzu daha kolay anlamasini saglar.
    - Her metot, belirli bir islevi acikca ifade eder, bu nedenle kodunuzun ne yaptigini anlamak daha kolaydir.


### 1. Parametresiz ve Geriye Deger Donmeyen Metot

Bir metot tanimlamak icin `public static` anahtar kelimelerini kullaniriz. Ilk ornegimizde, hicbir parametre almayan ve geriye deger dondurmeyen bir metot tanimliyoruz:

```java
public class MetotOrnekleri {

    // Metot tanimi
    public static void selamla() {
        System.out.println("Merhaba!");
    }

    public static void main(String[] args) {
        // Metot cagrisi
        selamla();
    }
}
```

Bu metot, `selamla` adini tasiyor ve hicbir parametre almadan calisiyor. Yani, `main` metodu icinde `selamla()` seklinde cagrildiginda ekrana "Merhaba!" yazisi basilacaktir.

### 2. Bir Parametre Alan ve Geriye Deger Donmeyen Metot

Ikinci ornegimizde, bir parametre alan ve geriye deger donmeyen bir metot tanimliyoruz:

```java
public class MetotOrnekleri {

    // Metot tanimi
    public static void selamlaKisi(String isim) {
        System.out.println("Merhaba, " + isim + "!");
    }

    public static void main(String[] args) {
        // Metot cagrisi
        selamlaKisi("Ahmet");
    }
}
```

Bu sefer `selamlaKisi` adli metot, bir tane `String` tipinde parametre aliyor (`isim`). Bu parametre metot icinde kullanilarak ekrana "Merhaba, [isim]!" seklinde bir mesaj basiliyor. `main` metodu icinde bu metot cagrildiginda, `Ahmet` parametresiyle birlikte "Merhaba, Ahmet!" yazisi ekrana basilacaktir.

### 3. Iki Parametre Alan ve Geriye Deger Donen Metot

Ucuncu ornegimizde, iki parametre alan ve bu parametrelerin toplamini geriye donduren bir metot tanimliyoruz:

```java
public class MetotOrnekleri {

    // Metot tanimi
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static void main(String[] args) {
        // Metot cagrisi ve sonucun kullanimi
        int sonuc = topla(5, 3);
        System.out.println("Toplam: " + sonuc);
    }
}
```

Bu sefer `topla` adli metot, iki tane `int` tipinde parametre aliyor (`sayi1` ve `sayi2`). Bu iki sayi toplanarak `return` ifadesi ile geriye donduruluyor. `main` metodu icinde bu metot cagrildiginda, `5` ve `3` parametreleriyle birlikte `Toplam: 8` yazisi ekrana basilacaktir.

Metotlar, kodunuzu daha okunabilir, daha duzenli ve daha surdurulebilir hale getirir. Ayni kodu tekrar tekrar yazmaktan kacinip, moduler bir yapi olusturarak kodunuzu daha etkili bir sekilde yonetebilirsiniz.