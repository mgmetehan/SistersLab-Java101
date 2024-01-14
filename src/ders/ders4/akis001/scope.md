# Metotlarda Local ve Scope Kavramlari

## Local Degiskenler

Local degiskenler, sadece tanimlandiklari metot, fonksiyon veya blok icinde gecerli olan degiskenlerdir. Bu degiskenler, tanimlandiklari blok icindeki kodun calisma suresi boyunca yasarlar ve blok disinda erisilemezler. Bu durum, degiskenin yasam dongusunu ve erisilebilirligini sinirlar.

Ornek:

```java
public class LocalVariableExample {

    public static void main(String[] args) {
        int x = 10; // main metodu icinde tanimlanan local degisken

        if (x > 5) {
            int y = 20; // if blogu icinde tanimlanan local degisken
            System.out.println(x + y);
        }

        // System.out.println(y); // Hata! y, if blogu disinda erisilemez.
    }
}
```

Bu ornekte, `x` ve `y` local degiskenlerdir. `x`, `main` metodu icinde tanimlanmis bir local degisken iken, `y` sadece `if` blogu icinde tanimlanmis bir local degiskendir.

## Scope (Kapsam)

Kapsam (scope), bir degiskenin tanimlandigi ve gecerli oldugu belirli bir alani ifade eder. Bir degiskenin kapsami, o degiskenin nerelerden erisilebilecegini belirler. Local degiskenlerin kapsami, tanimlandiklari metot, fonksiyon veya blokla sinirlidir.

Ornek:

```java
public class ScopeExample {

    // global scope
    public static int globalVariable = 50;

    public static void main(String[] args) {
        int x = 10; // local scope

        if (x > 5) {
            int y = 20; // local scope
            System.out.println(x + y);

            globalVariable = 100; // global scope
        }

        // System.out.println(y); // Hata! y, if blogu disinda erisilemez.
        System.out.println(globalVariable); // globalVariable, main metodu icinde erisilebilir.
    }
}
```

Bu ornekte, `globalVariable` global bir degisken olarak tanimlanmis ve `main` metodu icinde erisilebilir. Ancak, `x` ve `y` local degiskenlerdir ve sadece tanimlandiklari blok icinde erisilebilirler. Global degiskenler, tanimlandiklari sinifin icindeki her yerden erisilebilir.

## Sonuc

Metotlarda lokal degiskenler ve kapsam kavramlari, degiskenlerin tanimlandiklari yerler ve bu yerlere erisim kurallari hakkinda onemli bilgiler saglar. Bu kavramlar, programin duzenini ve guvenligini artirmaya yardimci olur, ayni zamanda kodun daha okunabilir ve surdurulebilir olmasina katki saglar.