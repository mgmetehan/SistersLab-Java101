`if`, `else if`, ve `else` ifadeleri, programlarda farkli sartlara bagli olarak farkli kod bloklarini calistirmak icin kullanilir. Bu ifadeler, kontrol akisini yonlendirmek ve cesitli durumlari ele almak icin onemli araclardir. Iste bu ifadeleri aciklayan bir ornek:

**`if`, `else if`, ve `else` Ifadeleri:**

`if`: Belirli bir kosulun dogru olup olmadigini kontrol eder. Eger kosul dogruysa, ilgili kod blogu calistirilir.

`else if`: Bir onceki `if` veya `else if` ifadesi yanlissa, yeni bir kosulu kontrol eder. Eger bu kosul dogruysa, ilgili kod blogu calistirilir.

`else`: Yukaridaki `if` veya `else if` ifadelerinin hicbiri dogru degilse, `else` blogu calistirilir. `else` ifadesi, bir sart saglanmadiginda varsayilan bir durumu belirtmek icin kullanilir.

**Ornek:**

public class IfElseIfElseOrnegi2 {
public static void main(String[] args) {
int sayi = 0;

        if (sayi > 0) {
            System.out.println("Sayi pozitif.");
        } else if (sayi < 0) {
            System.out.println("Sayi negatif.");
        } else {
            System.out.println("Sayi sifir.");
        }
    }
}


```java
public class IfElseIfElseOrnegi {
    public static void main(String[] args) {
        int not = 75;

        if (not >= 90) {
            System.out.println("A");
        } else if (not >= 80) {
            System.out.println("B");
        } else if (not >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
```
