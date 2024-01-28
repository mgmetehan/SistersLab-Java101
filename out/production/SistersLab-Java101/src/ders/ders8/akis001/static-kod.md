# Java 101 Bootcamp - Static Kod Bloklari

## 1. Giris

Java programlama dilinde, "static" kod bloklari sinif yuklendiginde yalnizca bir kez calisan ve genellikle sinifin baslatilmasi icin kullanilan ozel kod bloklaridir. Bu bloklar, sinif icerisine eklenir ve sinifin olusturulmasi sirasinda calisirlar.

## 2. Kullanimi

Static kod bloklari asagidaki gibi tanimlanir:

```java
public class StaticBlockExample {
    // Static kod blogu
    static {
        System.out.println("Bu bir static kod blogudur ve sadece bir kez calisir.");
        // Buraya istediginiz kodlari ekleyebilirsiniz.
    }
}
```

Yukaridaki ornekte `static` kelimesi ile isaretlenmis olan blok, sinif yuklendiginde calisacak olan static bir kod blogudur. Bu blok icerisine istediginiz kodlari ekleyebilirsiniz.

## 3. Sinif Yuklendiginde Calisma

Static kod bloklari, sinifin ilk kez yuklendigi an calisir. Bu genellikle sinifin bir ornegi olusturulmadan once gerceklesir.

```java
public class Main {
    public static void main(String[] args) {
        // StaticBlockExample sinifi burada yuklenir.
        // Bu asamada static kod blogu calisir.
        StaticBlockExample example = new StaticBlockExample();
    }
}
```

Yukaridaki ornekte, `StaticBlockExample` sinifi yuklendiginde static kod blogu calisacaktir.

## 4. Birden Cok Static Kod Blogu

Bir sinif icinde birden cok static kod blogu tanimlanabilir. Siralama onemlidir, kod bloklari yukaridan asagiya dogru sirayla calisir.

```java
public class MultipleStaticBlocks {
    // Ilk static kod blogu
    static {
        System.out.println("Ilk static kod blogu");
    }

    // Ikinci static kod blogu
    static {
        System.out.println("Ikinci static kod blogu");
    }
}
```

Yukaridaki ornekte, `MultipleStaticBlocks` sinifi yuklendiginde once "Ilk static kod blogu", ardindan "Ikinci static kod blogu" yazdirilacaktir.

Static kod bloklari, genellikle sinifin baslatilmasi veya baska kaynaklarin yuklenmesi icin kullanilir. Ozellikle, once bir islem gerceklestirmeniz gereken durumlar icin oldukca kullanislidir.

