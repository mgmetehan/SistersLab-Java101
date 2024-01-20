# `Java` Tek Boyutlu Diziler: Genel Bakis

Java'da tek boyutlu diziler, ayni veri tipindeki elemanlarin sirali bir sekilde depolanmasini saglayan veri yapilaridir. Bu diziler, programlamada veri koleksiyonlari olusturmak ve islemek icin kullanilir. Iste Java tek boyutlu dizilerin genel mantigina dair ana konular:

## 1. Dizi Tanimlama

Java'da tek boyutlu bir dizi tanimlamak icin su syntax kullanilir:

```java
veriTipi[] diziAdi = new veriTipi[diziUzunlugu];
```

Ornegin:

```java
int[] sayilar = new int[5];
```

Bu ornekte, "sayilar" adinda bir int tipinde dizi tanimlanmis ve bu dizi 5 elemana sahiptir.

## 2. Dizi Elemanlarina Erisim

Dizi elemanlarina erismek icin indis numaralari kullanilir. Indis numaralari 0'dan baslar.

```java
sayilar[0] = 10;
sayilar[1] = 20;
int eleman = sayilar[2];
```

Bu ornekte, 0. indisine 10, 1. indisine 20 degeri atanmis, ve 2. indisindeki deger "eleman" adli degiskene atilmistir.

## 3. Dizi Yaratma

Diziye baslangic degerleri atamak icin su yontemi kullanabiliriz:

```java
int[] sayilar = {10, 20, 30, 40, 50};
````

Bu sekilde dizi tanimlanirken ayni zamanda elemanlarina baslangic degerleri atanmis olur.

## 4. Dizi Uzunlugu

Bir dizinin uzunlugunu ogrenmek icin length ozelligi kullanilir.

```java
int uzunluk = sayilar.length;
```

Bu ornekte, "uzunluk" degiskeni "sayilar" dizisinin uzunlugunu icerir.

## 5. Dongulerle Dizi Islemleri

Donguler, diziler uzerinde islem yapmak icin sikca kullanilir. Ornegin, bir dizinin elemanlarini yazdirmak icin for dongusu kullanilabilir.

```java
for (int i = 0; i < sayilar.length; i++) {
System.out.println(sayilar[i]);
}
```


### Soru 1: Dizi Elemanlarini Toplama

```java
public class DiziToplama {
    public static void main(String[] args) {
        int[] sayilar = {5, 10, 15, 20, 25};
        int toplam = toplamHesapla(sayilar);
        System.out.println("Dizi Elemanlarinin Toplami: " + toplam);
    }

    static int toplamHesapla(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
}
```

### Soru 2: En Buyuk Elemani Bulma

```java
public class EnBuyukEleman {
    public static void main(String[] args) {
        int[] sayilar = {14, 7, 25, 30, 10};
        int enBuyuk = enBuyukBul(sayilar);
        System.out.println("En Buyuk Eleman: " + enBuyuk);
    }

    static int enBuyukBul(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }
}
```

### Soru 3: Cift Sayilari Bulma

```java
public class CiftSayilariBulma {
    public static void main(String[] args) {
        int[] sayilar = {3, 8, 12, 5, 10};
        ciftSayilariYazdir(sayilar);
    }

    static void ciftSayilariYazdir(int[] dizi) {
        System.out.println("Cift Sayilar:");
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                System.out.println(dizi[i]);
            }
        }
    }
}
```

### Soru 4: Bir Sayiyi Dizide Arama

```java
import java.util.Scanner;

public class SayiArama {
    public static void main(String[] args) {
        int[] sayilar = {7, 14, 21, 28, 35};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aranacak Sayiyi Girin: ");
        int arananSayi = scanner.nextInt();

        if (sayiBul(sayilar, arananSayi)) {
            System.out.println("Sayi Dizide Bulundu.");
        } else {
            System.out.println("Sayi Dizide Bulunamadi.");
        }
    }

    static boolean sayiBul(int[] dizi, int arananSayi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananSayi) {
                return true;
            }
        }
        return false;
    }
}
```

### Soru 5: Dizi Elemanlarini Ters Cevirme

```java
import java.util.Arrays;

public class TersCevirme {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5};
        tersCevirVeYazdir(sayilar);
    }

    static void tersCevirVeYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length / 2; i++) {
            int temp = dizi[i];
            dizi[i] = dizi[dizi.length - 1 - i];
            dizi[dizi.length - 1 - i] = temp;
        }
        System.out.println("Ters Cevrilen Dizi: " + Arrays.toString(dizi));
    }
}
```

### Soru 6: Ortalama Hesaplama

```java
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};
        double ortalama = ortalamaHesapla(sayilar);
        System.out.println("Dizi Elemanlarinin Ortalamasi: " + ortalama);
    }

    static double ortalamaHesapla(int[] dizi) {
        int toplam = 0;
        for (int eleman : dizi) {
            toplam += eleman;
        }
        return (double) toplam / dizi.length;
    }
}
```

### Soru 7: Pozitif ve Negatif Sayilari Ayirma

```java
public class PozitifNegatifAyirma {
    public static void main(String[] args) {
        int[] sayilar = {-5, 10, -15, 20, -25};
        pozitifNegatifAyir(sayilar);
    }

    static void pozitifNegatifAyir(int[] dizi) {
        System.out.println("Pozitif Sayilar:");
        for (int eleman : dizi) {
            if (eleman > 0) {
                System.out.println(eleman);
            }
        }

        System.out.println("Negatif Sayilar:");
        for (int eleman : dizi) {
            if (eleman < 0) {
                System.out.println(eleman);
            }
        }
    }
}
```

### Soru 8: Dizi Elemanlarini Kopyalama

```java
import java.util.Arrays;

public class DiziKopyalama {
    public static void main(String[] args) {
        int[] orjinalDizi = {1, 2, 3, 4, 5};
        int[] kopyaDizi = diziKopyala(orjinalDizi);
        System.out.println("Orjinal Dizi: " + Arrays.toString(orjinalDizi));
        System.out.println("Kopya Dizi: " + Arrays.toString(kopyaDizi));
    }

    static int[] diziKopyala(int[] dizi) {
        int[] kopya = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            kopya[i] = dizi[i];
        }
        return kopya;
    }
}
```

### Soru 9: Dizi Elemanlarini Guncelleme

```java
import java.util.Arrays;

public class ElemanGuncelleme {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};
        System.out.println("Orjinal Dizi: " + Arrays.toString(sayilar));

        elemanGuncelle(sayilar, 2, 35); // 2. indisdeki elemani 35 ile guncelle
        System.out.println("Guncellenmis Dizi: " + Arrays.toString(sayilar));
    }

    static void elemanGuncelle(int[] dizi, int indis, int yeniDeger) {
        if (indis >= 0 && indis < dizi.length) {
            dizi[indis] = yeniDeger;
        } else {
            System.out.println("Gecersiz indis!");
        }
    }
}
```

### Soru 10: Fibonacci Dizisi

```java
import java.util.Arrays;

public class FibonacciDizisi {
    public static void main(String[] args) {
        int N = 10;
        int[] fibonacciDizisi = fibonacciOlustur(N);
        System.out.println("Fibonacci Dizisi: " + Arrays.toString(fibonacciDizisi));
    }

    static int[] fibonacciOlustur(int N) {
        int[] fibonacciDizisi = new int[N];
        fibonacciDizisi[0] = 0;
        fibonacciDizisi[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacciDizisi[i] = fibonacciDizisi[i - 1] + fibonacciDizisi[i - 2];
        }

        return fibonacciDizisi;
    }
}
```
