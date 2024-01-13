Elbette, iste `for` dongusune dair bir konu anlatimi:

## `for` Dongusu Nedir?

`for` dongusu, belirli bir kosul dogru oldugu surece belirli bir kod blogunu belirli bir sayida tekrar etmek icin kullanilan bir dongu yapisidir. `for` dongusu, genellikle bir baslangic degeri, bir bitis kosulu ve bir artis miktari iceren uc ana bilesenle tanimlanir.

## `for` Dongusu Formati

```java
for (baslangic_degeri; kosul; artis_degeri) {
    // Dongu icinde gerceklestirilecek islemler
}
```

- `baslangic_degeri`: Dongunun baslangic degerini belirtir. Dongu basladiginda sadece bir kez calisir.
- `kosul`: Dongunun devam edip etmeyecegini kontrol eden bir kosuldur. Kosul dogru oldugu surece dongu devam eder.
- `artis_degeri`: Her dongu adimindan sonra degiskenin artirilmasi veya azaltilmasi icin kullanilan bir ifadedir.

## `for` Dongusu Isleyisi

1. Baslangic degeri bir kez calistirilir.
2. Kosul kontrol edilir. Eger kosul dogruysa, dongu icindeki islemler gerceklestirilir.
3. Artis degeri uygulanir.
4. Kosul tekrar kontrol edilir.
5. Eger kosul hala dogruysa, adim 3'ten baslayarak dongu tekrar eder. Kosul yanlissa dongu sona er.

## `for` Dongusu Ornek

Asagida, 1'den 5'e kadar olan sayilari ekrana yazdiran bir `for` dongusu ornegi bulunmaktadir:

```java
public class ForDongusuOrnek {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sayi: " + i);
        }
    }
}
```

Bu program, `for` dongusu kullanarak 1'den 5'e kadar olan sayilari ekrana yazdiracaktir. Baslangic degeri (`i = 1`), kosul (`i <= 5`), ve artis degeri (`i++`) kullanilarak dongu saglanmistir.


Soru: 1 ile 100 arasindaki cift sayilari ekrana yazdirin.
```java

public class Soru2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}

```
---


Soru: Carpim tablosunu ekrana yazdirin.
```java

public class Soru18 {
    public static void main(String[] args) {
        System.out.println("Carpim Tablosu:");
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf(i * j);//"%4d", i * j
            }
            System.out.println();
        }
    }
}

```
---


Soru 20: 1 ile 50 arasindaki sayilari toplayin, ancak 20'ye bolunebilen sayilari toplama dahil etmeyin.
```java

public class Soru20 {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 20 != 0) {
                toplam += i;
            }
        }

        System.out.println("1 ile 50 arasindaki 20'ye bolunmeyen sayilarin toplami: " + toplam);
    }
}

```
---