# Java 101 Bootcamp - Encapsulation (Sarmalama) Ilkesi

## 1. Giris

Encapsulation (Sarmalama), nesne yonelimli programlamada kullanilan onemli bir ilkedir. Bu ilke, bir sinifin icindeki veri alanlarini (fields) ve bu alanlara erisimi kontrol etmeyi amaclar. Sarmalama sayesinde sinif icindeki veriler korunabilir ve guvenli bir sekilde kullanilabilir.

## 2. Neden Sarmalama?

- **Guvenlik**: Sarmalama, veriye dogrudan erisimi sinirlayarak hatali kullanimi engeller ve guvenligi artirir.

- **Esneklik**: Sinifin ic yapisini degistirmeden, disaridan erisimi kontrol ederek sinifin ic detaylarini gizler.

- **Bakim Kolayligi**: Ic detaylari gizleyerek, sinifin ic yapisinda degisiklik yapma ozgurlugu saglar.

## 3. Nasil Yapilir?

### 3.1. Private Veri Alanlari

Sinif icindeki veri alanlarini `private` olarak tanimlayarak dogrudan erisimi engelleriz. Disaridan sadece belirledigimiz yontemlerle bu alanlara erisim saglanabilir.

```java
public class BankAccount {
    // Private veri alanlari
    private double balance;

    // Public erisim metodu
    public double getBalance() {
        return balance;
    }

    // Public erisim metodu
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public erisim metodu
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

### 3.2. Getter ve Setter Metodlari

Veri alanlarina erisimi saglamak icin `getter` ve `setter` metodlari kullanilir. Bu metodlar, sinifin icindeki veri alanlarina kontrollu bir sekilde erisimi saglar.

```java
public class Person {
    // Private veri alanlari
    private String name;
    private int age;

    // Getter ve Setter metotlari
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Ek kontrol veya islemler eklenebilir.
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Yasin negatif olmamasini kontrol edebiliriz.
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

## 4. Faydalari

- **Guvenlik ve Kontrol**: Verilere sinirli erisim saglayarak, hatali kullanimlari onler ve guvenligi artirir.

- **Esneklik**: Sinif ic yapisini degistirmeden, disaridan erisimi kontrol ederek kodu daha esnek ve surdurulebilir hale getirir.

- **Anlasilirlik**: Sinifin ic detaylarini gizleyerek, kodun anlasilabilirligini artirir.

## 5. Ornek Kullanim

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Hesap Bakiyesi: " + account.getBalance());
    }
}
```

Bu ornekte, `BankAccount` sinifinin ic detaylari gizlenmis ve sadece belirli metodlarla erisilebilir hale getirilmistir.

