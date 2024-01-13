# `while` Dongusu Nedir?

Java programlamasinda, `while` dongusu belirli bir kosul dogru oldugu surece belirli bir kod blogunu tekrar tekrar
calistiran bir yapidir. Bu dongu, baslangicta kosul dogru oldugu muddetce devam eder. Kosul yanlis hale geldiginde dongu
sona erer.

## Temel `while` Dongusu Formati

```java
while(kosul){
        // Kosul dogru oldugu surece bu blok tekrarlanir
        // Dongu icinde yapilacak islemler buraya yazilir
        }
```

- `while`: Dongu baslatici anahtar kelimesidir.
- `kosul`: Bir mantiksal ifadedir. Eger bu ifade dogruysa, dongu devam eder. Yanlissa dongu sona erer.
- `{}` arasindaki kod blogu: Kosul dogru oldugu surece tekrarlanacak olan kodlari icerir.

## `while` Dongusu Isleyisi

1. Program, `while` dongusune girer.
2. Kosul kontrol edilir.
3. Eger kosul dogruysa, kod blogu calistirilir.
4. Kosul tekrar kontrol edilir.
5. Eger kosul h?l? dogruysa, adim 3-4 tekrarlanir.
6. Kosul yanlis hale geldiginde dongu sona er.

int i = 1;
while (i <= 5) {
System.out.print(i + ' ');
i++;
}

## `Ic ice while` Dongusu
```java
public class NestedForLoopExample {
    public static void main(String[] args) {
        int i = 1;
        int n = 3;

        while (i < 5) {
            System.out.println("i " + i);
            while (n != 0) {
                System.out.println("n " + n);
                n--;
            }
            i++;
        }
    }
}
```

## Ornek Soru ve Cozum

### Soru:

Ornek olarak, 1'den 10'a kadar olan sayilarin toplamini bulan bir program yazalim:

### Cozum:

```java

public class WhileOrnek {
    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;

        // "sayi" 10'dan kucuk veya esit oldugu surece dongu devam eder
        while (sayi <= 10) {
            // Her adimda "sayi"yi toplama ekleyerek guncelle
            toplam += sayi;

            // "sayi"yi bir arttir
            sayi++;
        }

        // Toplami ekrana yazdir
        System.out.println("1'den 10'a kadar olan sayilarin toplami: " + toplam);
    }
}

```

---

### Soru:

Kullanicidan alinan bir sayinin karesini hesaplayan bir program yazin. Program, kullanici 0 girene kadar calismalidir.

### Cozum:

```java
import java.util.Scanner;

public class KareHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;

        // Kullanici 0 girene kadar dongu devam eder
        while ((sayi = scanner.nextInt()) != 0) {
            int kare = sayi * sayi;
            System.out.println(sayi + " sayisinin karesi: " + kare);
        }

        scanner.close();
    }
}
```

Bu programda, kullanici 0 girmedikce `while` dongusu devam eder. Her adimda kullanicinin girdigi sayinin karesi
hesaplanir ve ekrana yazdirilir. Kullanici 0 girdiginde dongu sona erir.

---

### Soru:

Kullanici sifir (0) girene kadar pozitif sayilari toplar.

### Cozum:

```java

public class PositiveNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int number;

        System.out.println("Pozitif sayilarin toplamini bulma programi.");
        System.out.println("Girisi sonlandirmak icin 0'i girin.");

        while (true) {
            System.out.print("Bir sayi girin: ");
            number = scanner.nextInt();

            if (number == 0) {
                break; // Kullanici 0 girdiginde donguden cik
            } else if (number < 0) {
                System.out.println("Hatali giris! Pozitif bir sayi girin.");
                continue; // Negatif sayi durumunda donguyu tekrarla
            }

            total += number;
        }

        System.out.println("Toplam: " + total);
        scanner.close();
    }

```

---

## Ornek Soru:

Bir sayinin cift mi, tek mi oldugunu kontrol eden bir Java programi yazin. Kullanicidan surekli olarak sayi alin ve bu
kontrolu yapin.

### Cozum:

```java
import java.util.Scanner;

public class CiftTekKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi girin (0 girerek cikabilirsiniz): ");

        int sayi;
        while ((sayi = scanner.nextInt()) != 0) {
            if (sayi % 2 == 0) {
                System.out.println(sayi + " cift bir sayidir.");
            } else {
                System.out.println(sayi + " tek bir sayidir.");
            }

            System.out.println("Bir sayi girin (0 girerek cikabilirsiniz): ");
        }

        scanner.close();
    }
}
```

---

## Soru :

Kullanicidan bir sayi alin ve bu sayinin faktoriyelini hesaplayan bir Java programi yazin.

### Cozum:

```java
import java.util.Scanner;

public class FaktoriyelHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi girin: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.println("Faktoriyel: " + faktoriyel);

        scanner.close();
    }
}
```

---

## Ornek Soru:

Bir ogrencinin sinav notlarini giris olarak alin ve bu notlarin ortalamasini hesaplayan bir Java programi yazin.

### Cozum:

```java
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sinav notlarini girin (Negatif sayi girerek cikabilirsiniz): ");

        int notToplam = 0;
        int notAdedi = 0;

        int girilenNot;
        while ((girilenNot = scanner.nextInt()) >= 0) {
            notToplam += girilenNot;
            notAdedi++;
        }

        if (notAdedi > 0) {
            double ortalama = (double) notToplam / notAdedi;
            System.out.println("Not Ortalamasi: " + ortalama);
        } else {
            System.out.println("Hic not girilmedi.");
        }

        scanner.close();
    }
}
```