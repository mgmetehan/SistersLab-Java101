
# Java 101 Bootcamp - Kalitim (Inheritance)

## 1. Giris

Kalitim (inheritance), nesne yonelimli programlamada onemli bir prensiptir. Bu ilke, bir sinifin ozelliklerini ve davranislarini baska bir sinifa miras vermesini saglar. Kalitim sayesinde kod tekrari onlenir, kodun yeniden kullanilabilirligi artar ve siniflar arasinda bir hiyerarsi olusturulabilir.

## 2. Temel Kavramlar

### 2.1. Super Sinif (Superclass) ve Alt Sinif (Subclass)

- **Super Sinif (Superclass)**: Kalitim veren siniftir. Baska siniflara ozelliklerini ve davranislarini miras olarak verebilir.

- **Alt Sinif (Subclass)**: Kalitim alan siniftir. Baska bir sinifin ozelliklerini ve davranislarini miras alir.

```java
// Super Sinif
public class Animal {
    void eat() {
        System.out.println("Hayvan yemek yiyor.");
    }
}

// Alt Sinif
public class Dog extends Animal {
    void bark() {
        System.out.println("Hav hav!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Animal sinifinin eat metodu
        myDog.bark(); // Dog sinifinin bark metodu
    }
}    
```

Bu ornekte, `Animal` sinifi `eat` metodunu icermekte ve `Dog` sinifi, `Animal` sinifindan miras alarak bu metodu kullanabilmektedir.

## 3. Kalitimin Avantajlari

### 3.1. Kodun Tekrar Kullanilabilirligi

Super sinifin ozellikleri ve davranislari, alt siniflar tarafindan tekrar kullanilabilir.

```java
public class Circle {
    private double radius;

    // Constructor, getter ve setter metotlari...

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Cylinder extends Circle {
    private double height;

    // Constructor, getter ve setter metotlari...

    public double calculateVolume() {
        return calculateArea() * height;
    }
```

Burada `Cylinder` sinifi, `Circle` sinifindan miras alarak `calculateArea` metodunu kullanabilmektedir.

### 3.2. Polimorfizm

Alt siniflar, ust siniflarin yerine kullanilabilir (polimorfizm). Bu, ayni turden olan nesnelerin farkli alt turleriyle calisabilme yetenegidir.

```java
Shape myShape = new Circle();
myShape.draw(); // Circle sinifinin draw metodu calisir.
```

## 4. `super` Anahtar Kelimesi

`super` anahtar kelimesi, alt sinifta, ust sinifa ait bir ozelligi veya metodu cagirmak icin kullanilir.

```java
public class Animal {
    void eat() {
        System.out.println("Animal yemek yiyor...");
    }
}

public class Dog extends Animal {
    void eat() {
        super.eat(); // Ust sinifin eat metodu cagrilir.
        System.out.println("Dog yemek yiyor...");
    }
}
```

Bu ornekte, `Dog` sinifindaki `eat` metodu icinde `super.eat()` cagrisi ile ust sinifin `eat` metodu cagrilmistir.

## 5. Dikkat Edilmesi Gerekenler

- Kalitimin asiri kullanimindan kacinin. Asiri kalitim, karmasik ve bakimi zor kodlara neden olabilir.

- Sinif hiyerarsisini dikkatlice tasarlayin. Mantikli bir sinif hiyerarsisi, kodunuzu daha anlasilir ve surdurulebilir hale getirir.

Kalitim, nesne yonelimli programlamanin temel prensiplerinden biridir ve dogru kullanildiginda kodunuzu daha moduler ve esnek hale getirebilir. Basarilar dilerim!