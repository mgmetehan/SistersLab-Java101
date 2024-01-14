# Recursive (Ozyineli) Metotlar

## Giris

Recursive (ozyineli) metotlar, bir problemin cozumu icin ayni metodu tekrar tekrar cagiran ve alt problemlere bolerek sonuca ulasan metotlardir. Bu teknik, karmasik problemleri daha kucuk ve daha yonetilebilir parcalara ayirarak cozmek icin kullanilir. Recursive metotlar, bir fonksiyonun kendini cagirma ozelligi sayesinde bu stratejiyi uygular.

## Temel Ilkeler

Recursive metotlarin temel ozellikleri sunlardir:

1. **Kendini Cagirma:**
    - Recursive metotlar, kendi isimlerini kullanarak kendilerini cagirirlar.
    - Bu, bir problemin cozumunun kucuk parcalara bolunerek gerceklestirilmesini saglar.

2. **Bir Temel Durum:**
    - Recursive metotlar, bir temel durum (base case) ile sonlanmalidir.
    - Temel durum, metotun daha fazla alt probleme bolunmeden once cozume ulastigi durumu ifade eder.

## Ornek

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```


f(1) = 1;

f(2) = f(1) + 2;

f(3) = f(2) + 3;

f(4) = f(3) + 4;

..........

..........

f(n) = f(n-1) + n;


Faktoriyel hesaplama recursive bir ornek olabilir. Faktoriyel, bir sayinin kendisi ile 1 arasindaki tum pozitif tamsayilari carpmak demektir.


```java
public class RecursiveExample {

    // Faktoriyel hesaplama
    static int hesaplaFaktoriyel(int n) {
        if (n < 0) {
            return -1; // Negatif sayilarin faktoriyeli tanimsizdir.
        }

        long faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }

    public static void main(String[] args) {
        int result = hesaplaFaktoriyel(5);
        System.out.println("5! = " + result);
    }
}
```



```java
public class RecursiveExample {

    // Faktoriyel hesaplama
    public static int factorial(int n) {
        // Temel durum: 0! = 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive cagri
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5! = " + result);
    }
}
```

Bu ornekte, `factorial` metodu, kendini cagirarak faktoriyel hesaplama islemini gerceklestirir. Temel durum, n'nin 0 oldugu durumu ifade eder ve 0! degeri 1'dir.

## Avantajlar ve Dezavantajlar

### Avantajlar:

- **Problem Cozumu:**
    - Recursive metotlar, bir problemi daha kucuk ve anlasilir parcalara bolerek cozme stratejisini uygular.
- **Okunabilirlik:**
    - Bazi durumlarda, rekursif yapilar problemin cozumunu daha anlasilir kilabilir.

### Dezavantajlar:

- **Bellek Kullanimi:**
    - Her recursive cagrida bir frame bellekte ayrilmalidir. Derin recursive cagrilar buyuk bellek kullanimina neden olabilir.
- **Performans:**
    - Derin recursive cagrilar, performans sorunlarina neden olabilir ve stack tasmasina yol acabilir.

## Sonuc

Recursive metotlar, belirli turdeki problemlerin cozumunde guclu bir aractir. Ancak, dogru bir sekilde tasarlanmali ve temel durumlari dogru bir sekilde ele almalidir. Dikkatsiz kullanimi, stack tasmalarina ve performans sorunlarina neden olabilir.