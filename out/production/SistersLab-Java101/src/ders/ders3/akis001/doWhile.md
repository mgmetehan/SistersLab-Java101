# `do-while` Dongusu Nedir?

Java programlamasinda, `do-while` dongusu belirli bir kosul dogru oldugu surece belirli bir kod blogunu tekrar tekrar calistiran bir dongu yapisidir. Bu dongu, baslangicta kosul dogru olmasa bile en az bir kez calistirilir. Dongu blogu icindeki islemler gerceklestirildikten sonra kosul kontrol edilir ve kosul dogru ise dongu tekrar eder.

## Temel `do-while` Dongusu Formati

```java
do {
    // Dongu icinde gerceklestirilecek islemler
} while (kosul);
```

- `do`: Dongu baslangicidir ve dongu blogunu isaret eder.
- `{}` arasindaki kod blogu: Dongu icinde gerceklestirilecek islemleri icerir.
- `while (kosul)`: Dongu kosulu. Eger bu kosul dogruysa, dongu tekrar eder. Kosul yanlissa dongu sona er.

## `do-while` Dongusu Isleyisi

1. Program, `do-while` dongusune girer.
2. Dongu blogu icindeki islemleri gerceklestirir.
3. Kosul kontrol edilir.
4. Eger kosul dogruysa, adim 2'ye gidilir ve dongu tekrar eder.
5. Kosul yanlis hale geldiginde dongu sona er.

## `do-while` Dongusu Ornek

Asagida, kullanicidan bir sayi girisi alarak 0 girilene kadar sayilari toplayan bir `do-while` dongusu ornegi bulunmaktadir:

```java

public class SonsuzDoWhileOrnek {
    public static void main(String[] args) {
        int sayac = 1;

        // Kullanicidan giris almadan sonsuz bir dongu
        do {
            System.out.println("Merhaba, bu bir sonsuz do-while dongusu ornegidir.");
            sayac++;
        } while (sayac > 10); 
    }
}
```



```java

public class BasitDoWhileOrnek {
    public static void main(String[] args) {
        int sayi = 1;

        do {
            System.out.println("Dongu isletiliyor..");
            sayi++;
        } while (sayi < 5);
    }
}
```

```java
import java.util.Scanner;

public class DoWhileOrnek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.println("Bir sayi girin (0 girerek cikabilirsiniz): ");
            sayi = scanner.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("Girdiginiz sayilarin toplami: " + toplam);

        scanner.close();
    }
}
```

Bu ornekte, kullanici 0 girene kadar her defasinda bir sayi istenir ve bu sayilar toplanir. `do-while` dongusu, kosulun basta dogru olup olmamasina bakmaksizin en az bir kez calismasini saglar.