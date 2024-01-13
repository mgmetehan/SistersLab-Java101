# `break` ve `continue` Ifadeleri

Java programlamada `break` ve `continue` ifadeleri, dongulerin ve anahtar ifadelerin kontrol akisini yonlendirmek icin kullanilir. Bu ifadeler, donguleri durdurma, atlama veya bir sonraki iterasyona gecme gibi islevselligi saglar. Iste her bir ifadeyle ilgili detayli aciklamalar:

## `break` Ifadesi

`break` ifadesi, donguleri veya switch-case yapilarini aninda sonlandirmak icin kullanilir. Bu ifadeye ulasildiginda, donguden cikilir veya switch-case yapisindan cikilir. `break` ifadesi, bir dongu icinde veya bir switch-case yapisinda kullanilabilir.

### `break` Kullanimi Dongulerde:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
    if (i == 5) {
        break; // Donguyu sonlandirir
    }
}
```

### `break` Kullanimi Switch-Case Yapisinda:

```java
int gun = 3;
switch (gun) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Sali");
        break;
    // Diger gunler...
    default:
        System.out.println("Gecersiz gun");
}
```

## `continue` Ifadesi

`continue` ifadesi, dongulerde bir iterasyonu atlama islevi gorur. `continue` ifadesine ulasildiginda, geri kalan kod blogu calistirilmaz ve dongu bir sonraki iterasyona gecer.

### `continue` Kullanimi Dongulerde:

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Cift sayilari atlar
    }
    System.out.println(i);
}
```

Bu ornekte, `continue` ifadesi ile cift sayilar atlanir ve dongu devam eder.

## Ornek Kullanim: 1'den 100'e kadar olan sayilarin toplamini bulma (5 ve 7'ye bolunebilenleri atlayarak).

```java
int toplam = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 5 == 0 || i % 7 == 0) {
        continue; // 5 veya 7'ye bolunebilen sayilari atla
    }
    toplam += i;
}
System.out.println("1'den 100'e kadar olan sayilarin toplami (5 ve 7'ye bolunebilenleri atlayarak): " + toplam);
```

Bu ornekte, `continue` ifadesi ile 5 ve 7'ye bolunebilen sayilar atlanir ve toplama devam edilir.

Soru 17: 1'den 100'e kadar olan asal sayilari bulun ve ekrana yazdirin.
```java

public class Soru17 {
    public static void main(String[] args) {
        System.out.print("Asal Sayilar: ");
        
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}

```
---