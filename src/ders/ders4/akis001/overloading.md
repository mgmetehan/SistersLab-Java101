# Metotlarda Overloading (Asiri Yuklenme)

## Giris

Metot overloading (asiri yuklenme), Java programlamada ayni isme sahip metotlarin farkli parametrelerle birden fazla kez tanimlanabilmesini ifade eder. Bu ozellik, ayni islevselligi yerine getiren ancak farkli turde veya sayida parametre alan metotlarin ayni ismi tasimasina olanak tanir. Overloading, Java'da coklu metot tanimi yapmanin guclu bir yoludur.

## Overloading Kriterleri

Bir metotun asiri yuklenebilmesi icin asagidaki kriterlere uymasi gerekmektedir:

1. **Metot Ismi:**
    - Asiri yuklenen metotlar ayni isme sahip olmalidir.

2. **Parametre Listesi:**
    - Metotlarin parametre listesi farkli olmalidir.
    - Parametre sayisi veya parametre turleri farkli olabilir.

3. **Geri Donus Tipi:**
    - Geri donus tipi farkli olabilir. Ancak, sadece geri donus tipi degisikligi asiri yuklenmeyi saglamaz. Parametre listesindeki degisiklikler de gereklidir.

## Ornekler

### Metot Asiri Yuklenmesi Ornegi

```java
public class Matematik {

    // Iki integer sayiyi topla
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // Iki double sayiyi topla
    public static double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    // Uc integer sayiyi topla
    public static int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public static void main(String[] args) {
        // Metotlari cagirma
        int sonuc1 = topla(5, 3);
        double sonuc2 = topla(2.5, 3.5);
        int sonuc3 = topla(1, 2, 3);

        // Sonuclari yazdirma
        System.out.println("Toplam 1: " + sonuc1);
        System.out.println("Toplam 2: " + sonuc2);
        System.out.println("Toplam 3: " + sonuc3);
    }
}
```

Yukaridaki ornekte, `topla` metodu ayni ismi tasiyan uc farkli metotla asiri yuklenmistir. Her biri farkli parametre listelerine sahiptir.

## Avantajlari

1. **Esneklik:**
    - Ayni islevselligi ifade eden metotlar arasinda farkli durumlari ele almak icin kullanilir.

2. **Okunabilirlik:**
    - Ayni islevselligi saglayan metotlarin isimleri ayni oldugu icin, kodun anlasilabilirligini artirir.

3. **Kod Tekrarinin Azaltilmasi:**
    - Ayni ismi tasiyan metotlar sayesinde, ayni islevselligi saglamak icin ayni ismi tekrar tekrar yazmak gerekmez.

4. **Daha Temiz Kod:**
    - Ilgili metotlar bir arada gruplandigindan, kod daha temiz ve duzenli hale gelir.

Metot overloading, Java'nin guclu ve esnek programlama ozelliklerinden biridir ve kodunuzun daha etkili bir sekilde yonetilmesini saglar.