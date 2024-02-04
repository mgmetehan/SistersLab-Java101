
# Java'da `throw` ve `throws` Kullanimi

Java'da `throw` ve `throws`, hata yonetimi ve ozel durumlari ele almak icin kullanilan iki onemli anahtardir. `throw`, bir ozel durumu program icinde firlatmak icin kullanilirken, `throws`, bir metodun belirli turdeki exception'lari firlatabilecegini belirtmek icin kullanilir.

## `throw` Ifadesi

`throw` ifadesi, bir ozel durumu isaret etmek ve programin normal akisini bozmak icin kullanilir. Bu, programcinin belirli bir durumu tespit ettiginde bir exception olusturmasina ve bu exception'i programin baska bir bolumunde yakalamasina olanak tanir.

### Temel `throw` Kullanimi

```java
throw new ExceptionTur("Hata mesaji");
```

- `throw`: Bir exception firlatmak icin kullanilan anahtar kelime.
- `ExceptionTur`: Firlatilmak istenen exception'in turunu temsil eder.
- `"Hata mesaji"`: Firlatilan exception ile ilgili bir aciklama veya mesaj.

### Ornek Kullanim

```java
public class HataFirlatmaOrnegi {

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (NegativeNumberException ex) {
            System.err.println("Hata yakalandi: " + ex.getMessage());
        }
    }

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negatif sayi bulundu: " + number);
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
```

Bu ornekte, `checkNumber` metodunda bir sayinin negatif olup olmadigini kontrol ediyoruz. Eger sayi negatifse, ozel bir `NegativeNumberException` exception firlatiyoruz. Daha sonra `main` metodunda bu hatayi ele almak icin bir `try-catch` blogu kullaniyoruz.

## `throws` Ifadesi

`throws` ifadesi, bir metodun belirli turdeki exception'lari firlatabilecegini belirtir. Bu, metodun icinde bu turde exception'lari firlatabilecegimizi ve cagrildigi yerde bu exception'lari ele almasi gerektigini belirtir.

### Temel `throws` Kullanimi

```java
public void myMethod() throws MyException {
    // Metodun icinde MyException turunden exception firlatilabilir
}
```

### Ornek Kullanim

```java
public class MetodOrnegi {

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (MyException ex) {
            System.err.println("Hata yakalandi: " + ex.getMessage());
        }
    }

    public static void myMethod() throws MyException {
        // Metodun icinde bir hata durumu kontrol edildiginde MyException firlatilir
        throw new MyException("Ozel bir hata meydana geldi!");
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

Bu ornekte, `myMethod` adli bir metodun icinde bir hata durumu kontrol edildiginde ozel bir `MyException` exception firlatilir. Daha sonra `main` metodunda bu hatayi ele almak icin bir `try-catch` blogu kullanilir.

## throw ile throws arasindaki fark ne

Java'da `throw` ve `throws` ifadeleri, hata yonetimi ve ozel durumlari ele almak icin kullanilan iki farkli kavramdir. Ikisi arasindaki temel fark sudur:

1. **`throw`:**
    - `throw` ifadesi, bir ozel durumu (exception) program icinde firlatmak icin kullanilir.
    - Bir hata durumu tespit edildiginde, programci tarafindan belirli bir exception olusturularak programin normal akisi kesilir.
    - Genellikle ozel durumlari isaret etmek ve hatanin kaynagini belirtmek icin kullanilir.
    - `throw` ifadesi, bir try-catch blogu icinde veya bir metod icinde kullanilabilir.

   Ornek:

   ```java
   throw new MyException("Ozel bir hata olustu!");
   ```

2. **`throws`:**
    - `throws` ifadesi, bir metodun belirli turdeki exception'lari firlatabilecegini belirtmek icin kullanilir.
    - Metot imzasinda kullanilir ve belirtilen exception'lar, metodun icinde firlatilabilir.
    - Bu, cagrildigi yerde bu exception'lari ele almasi gereken kod tarafindan bilinmesini saglar.
    - `throws` ifadesi, bir metodun basinda metodun dondugu turden once belirtilir.

   Ornek:

   ```java
   public void myMethod() throws MyException {
       // Metodun icinde bir hata durumu kontrol edildiginde MyException firlatilir
       throw new MyException("Ozel bir hata meydana geldi!");
   }
   ```

Genel olarak, `throw` bir ifadedir ve bir exception firlatmak icin kullanilirken, `throws` bir deklaratiftir ve bir metodun belirli turdeki exception'lari firlatabilecegini belirtmek icin kullanilir. Bu iki kavram, programin hatayla basa cikma stratejilerini ve kullanim baglamini belirlemede onemli rol oynar.
