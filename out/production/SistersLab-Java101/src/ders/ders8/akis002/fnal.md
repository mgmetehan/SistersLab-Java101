# Java 101 Bootcamp - `final` Anahtar Kelimesi ve Sabit Tanimlama

## 1. `final` Degiskenler

`final` degiskenler, bir kez deger atandiktan sonra degistirilemezler. Bu ozellik, sabit degerlerin guvenli bir sekilde kullanilmasini saglar.

```java
public class Circle {
    // Pi sayisini sabit olarak tanimlama
    public static final double PI = 3.14;

    // Yari capi degisken olarak tanimlama
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Cemberin alanini hesaplayan metod
    public double calculateArea() {
        // Hesaplama sirasinda PI degistirilemez.
        return PI * radius * radius;
    }
}
```

Bu ornekte, `PI` sabitinin degeri bir kez atanir ve daha sonra degistirilemez.

## 2. `final` Metotlar

`final` metotlar, alt siniflar tarafindan degistirilemez. Bu, belirli bir davranisin sabit kalmasini saglar.

```java
public class Animal {
    // Metodu final olarak tanimlama
    public final void makeSound() {
        System.out.println("Hayvan sesi!");
    }
}

public class Dog extends Animal {
    // Hata! final metot override edilemez.
    // @Override
    public void makeSound() {
        System.out.println("Hav hav!");
    }
}
```

`makeSound()` metodu `final` oldugu icin, `Dog` sinifinda bu metot degistirilemez.

## 3. `final` Siniflar

`final` siniflar, baska bir sinif tarafindan miras alinamazlar. Bu, belirli bir sinifin yapisinin degismemesini saglar.

```java
public final class MathUtils {
    // Sinif icerigi ve metotlar
}

// Hata! final sinif miras alinamaz.
// public class AdvancedMathUtils extends MathUtils {
//     // ...
// }
```

`MathUtils` sinifi `final` olarak tanimlandigi icin, baska bir sinif tarafindan miras alinamaz.

## 4. Sabit Tanimlama

Sabitler, program icinde degismeyen degerleri temsil eder. Genellikle buyuk harflerle ve alt cizgilerle ayrilarak tanimlanirlar.

```java
public class Constants {
    // Hiz limiti sabiti
    public static final int SPEED_LIMIT = 120;

    // Uygulama adi sabiti
    public static final String APP_NAME = "MyApp";
}
```

Bu sabitler, program icinde hiz limiti veya uygulama adi gibi degismeyen degerleri temsil eder.

`final` anahtar kelimesi, kodunuzun daha guvenli ve surdurulebilir olmasina yardimci olur. Sabit tanimlamak ise degismeyen degerleri daha okunabilir hale getirir.
