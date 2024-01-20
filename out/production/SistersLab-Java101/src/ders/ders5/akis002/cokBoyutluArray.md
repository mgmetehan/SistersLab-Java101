# Java Cok Boyutlu Diziler: Genel Bakis

Java'da cok boyutlu diziler, ic ice gecmis tek boyutlu diziler olarak dusunulebilir. Bu yapilar, matris ve cok boyutlu veri yapilari gibi durumlar icin kullanilir. Iste Java'da cok boyutlu dizilerin genel mantigina dair ana konular:

## 1. Cok Boyutlu Dizi Tanimlama

Java'da iki boyutlu bir diziyi tanimlamak icin su syntax kullanilir:

```java
veriTipi[][] diziAdi = new veriTipi[satirSayisi][sutunSayisi];
```

Ornegin:

```java
int[][] matris = new int[3][4];
```

Bu ornekte, "matris" adinda 3x4 boyutunda bir matris tanimlanmistir.

## 2. Cok Boyutlu Dizi Elemanlarina Erisim

Cok boyutlu dizilerde elemanlara erisim icin iki indis kullanilir.

```java
matris[0][0] = 10;
matris[1][2] = 20;
int eleman = matris[2][3];
```

Bu ornekte, belirli indislerdeki elemanlara deger atanmis ve bir eleman baska bir degiskene atanmistir.

## 3. Cok Boyutlu Dizi Inisiyallestirme

Cok boyutlu dizilere baslangic degerleri atamak icin su yontemi kullanabiliriz:

```java
int[][] matris = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Bu sekilde matris tanimlanirken ayni zamanda elemanlarina baslangic degerleri atanmis olur.

## 4. Dizi Uzunlugu

Cok boyutlu dizilerde her bir boyutun uzunlugu ayri ayri ogrenilir.

```java
int satirSayisi = matris.length;
int sutunSayisi = matris[0].length;
```

Bu ornekte, "satirSayisi" degiskeni matrisin satir sayisini, "sutunSayisi" degiskeni ise matrisin sutun sayisini icerir.

## 5. Uc ve Daha Fazla Boyutlu Diziler

Java'da uc veya daha fazla boyutlu diziler de tanimlanabilir. Ornegin, uc boyutlu bir dizi su sekildedir:

```java
int[][][] ucBoyutluDizi = new int[3][4][5];
```

Bu ornekte, 3x4x5 boyutunda bir uc boyutlu dizi tanimlanmistir.

Cok boyutlu diziler, matrisler ve cok katmanli veri yapilari gibi durumlar icin kullanislidir. Ilgili veri yapisinin boyutlarina gore dizilerin daha fazla boyut eklenerek kullanilabilir.

### Iki Boyutlu Matris Ornekleri

#### Ornek 1: Iki Boyutlu Matris Tanimlama ve Elemanlarina Erisim

```java
public class MatrisInisiyalleme {
    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*
        int[][] matris = new int[3][3];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;
        matris[2][0] = 7;
        matris[2][1] = 8;
        matris[2][2] = 9;
         */

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

#### Ornek 2: Matris Elemanlarini Toplama

```java
public class MatrisElemanlariToplama {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int toplam = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                toplam += matris[i][j];
            }
        }

        System.out.println("Matris Elemanlarinin Toplami: " + toplam);
    }
}
```

#### Ornek 3: Elle Matris Olusturma

```java
public class ElleMatrisOlusturma {
    public static void main(String[] args) {
        int[][] matris = new int[3][3];

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                matris[satir][sutun] = satir + sutun;
            }
        }

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(matris[satir][sutun] + " ");
            }
            System.out.println();
        }
    }
}
```

#### Ornek 4: Iki Matris Toplama

```java
public class MatrisToplama {
    public static void main(String[] args) {
        int[][] matris1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matris2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] toplamMatrisi = new int[3][3];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                toplamMatrisi[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        for (int i = 0; i < toplamMatrisi.length; i++) {
            for (int j = 0; j < toplamMatrisi[i].length; j++) {
                System.out.print(toplamMatrisi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

#### Ornek 5: Satir ve Sutun Toplamini Bulma

```java
public class SatirSutunToplam {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] satirToplamlari = new int[matris.length];
        int[] sutunToplamlari = new int[matris[0].length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                satirToplamlari[i] += matris[i][j];
                sutunToplamlari[j] += matris[i][j];
            }
        }

        System.out.println("Satir Toplamlari:");
        for (int i = 0; i < satirToplamlari.length; i++) {
            System.out.println("Satir " + i + ": " + satirToplamlari[i]);
        }

        System.out.println("\nSutun Toplamlari:");
        for (int j = 0; j < sutunToplamlari.length; j++) {
            System.out.println("Sutun " + j + ": " + sutunToplamlari[j]);
        }
    }
}
```

#### Ornek 6: Matris Carpimi

```java
public class MatrisCarpimi {
    public static void main(String[] args) {
        int[][] matris1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matris2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] carpimSonucu = new int[matris1.length][matris2[0].length];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {
                for (int k = 0; k < matris1[0].length; k++) {
                    carpimSonucu[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }

        for (int i = 0; i < carpimSonucu.length; i++) {
            for (int j = 0; j < carpimSonucu[i].length; j++) {
                System.out.print(carpimSonucu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```



