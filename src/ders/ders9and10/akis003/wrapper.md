# Java Bootcamp - Wrapper Siniflar

## Giris

Bu dokumantasyon, Java programlama dilindeki Wrapper Siniflarin kullanimini anlatmaktadir. Wrapper siniflar, temel veri tiplerini nesne olarak ele alarak ek islevsellik saglar. Bu ozellik, bazi durumlarda daha fazla kontrol ve islevsellik saglamak icin kullanislidir.

## Temel Veri Tipleri ve Wrapper Siniflar

Java'nin temel veri tipleri sunlardir:

- **byte**
- **short**
- **int**
- **long**
- **float**
- **double**
- **char**
- **boolean**

Her bir temel veri tipi icin birer tane wrapper sinif bulunmaktadir. Wrapper siniflari sunlardir:

- **Byte**
- **Short**
- **Integer**
- **Long**
- **Float**
- **Double**
- **Character**
- **Boolean**

## Neden Wrapper Siniflari?

1. **Null Deger Isleme:** Wrapper siniflar, temel veri tiplerinin null degerlerini ele alabilir. Ornegin, `Integer` sinifi null degeri icerebilirken, `int` bu degeri iceremez.

2. **Koleksiyonlarda Kullanim:** Java koleksiyonlari (List, Set, Map) yalnizca nesneleri icerebilir. Wrapper siniflar, temel veri tiplerini bu koleksiyonlarda kullanmamiza olanak tanir.

3. **Metot Parametreleri:** Bazi durumlarda, bir metotun parametre olarak yalnizca nesne alabilmesi gerekir. Wrapper siniflari, bu durumlari yonetmemize yardimci olur.

## Wrapper Siniflarin Kullanimi

Wrapper siniflari, genellikle asagidaki sekilde kullanilir:

```java
// Temel veri tipinden wrapper sinifa donusum (boxing)
int primitiveInt = 42;
Integer wrapperInt = Integer.valueOf(primitiveInt);

// Wrapper sinifindan temel veri tipine donusum (unboxing)
Integer wrapperNumber = 100;
int primitiveNumber = wrapperNumber.intValue();
```

Yukaridaki ornekte, `Integer.valueOf()` metoduyla bir `int` degeri `Integer` tipine donusturuluyor (boxing). Ayrica, `intValue()` metoduyla bir `Integer` nesnesi tekrar temel `int` degerine donusturuluyor (unboxing).

## Ornek Uygulama

```java
public class WrapperExample {
    public static void main(String[] args) {
        // Boxing
        Integer num1 = Integer.valueOf(50);

        // Unboxing
        int num2 = num1.intValue();

        System.out.println("Boxing: " + num1);
        System.out.println("Unboxing: " + num2);
    }
}
```

Bu ornek, basit bir boxing ve unboxing islemi gostermektedir.

## Sonuc

Wrapper siniflari, temel veri tiplerini nesne olarak ele alarak Java programlamasinda ek esneklik ve islevsellik saglar. Bu ozellikleri dogru ve etkili bir sekilde kullanarak kodlarinizi daha guclu hale getirebilirsiniz.
