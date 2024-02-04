# Java Try-Catch-Finally Bloklari

Java programlamada, hata yonetimi onemli bir konudur. Try-Catch-Finally bloklari, programinizin hata durumlariyla nasil basa cikacagini belirlemenize yardimci olan bir yapi saglar. Bu bloklar, hatanin kontrol edilmesini ve programin duzgun bir sekilde sonlanmasini saglar.

## 1. Try Blogu

Try blogu, potansiyel olarak hata firlatabilecek olan kod blogunu icerir. Bu blok icindeki kodlar calistirilmaya calisilir.

```java
try {
    // Hata firlatabilecek kodlar buraya yazilir
    // Ornegin: Dosya okuma, ag islemleri, veritabani erisimi
} 
```

## 2. Catch Blogu

Catch blogu, Try blogu icindeki kodlarin calistirilmasi sirasinda bir hata olustugunda bu hatayi yakalar ve isler. Birden fazla Catch blogu kullanilabilir, fakat sadece uygun olan Catch blogu calistirilir.

```java
catch (ExceptionTur1 exception1) {
    // Hata turu 1 icin islemler
} catch (ExceptionTur2 exception2) {
    // Hata turu 2 icin islemler
} 
//...
catch (ExceptionTurN exceptionN) {
    // Hata turu N icin islemler
}
```

## 3. Finally Blogu

Finally blogu, Try blogu icindeki kodlar calistirilsa da calistirilmasa da her durumda calistirilacak kodlari icerir. Genellikle kaynaklari serbest birakma, temizleme islemleri gibi kodlar burada yer alir.

```java
finally {
    // Her durumda calistirilacak kodlar buraya yazilir
    // Ornegin: Dosya kapatma, veritabani baglantisini kapatma
}
```

## 4. Ornek Kullanim

Asagida, bir dosyayi okuma islemi icin Try-Catch-Finally bloklarinin nasil kullanilacagina dair basit bir ornek bulunmaktadir:

```java
public class BolmeIslemiOrnegi {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 0;

        try {
            int sonuc = bol(sayi1, sayi2);
            System.out.println("Sonuc: " + sonuc);
        } catch (ArithmeticException e) {
            System.err.println("Hata: " + e.getMessage());
        } finally {
            System.out.println("Finally blogu her zaman calisir.");
        }
    }

    public static int bol(int pay, int payda) {
        return pay / payda;
    }
}

```
