
### For-each Dongusu Kullanimi

Java'da "for-each" dongusu, bir dizi veya Iterable koleksiyonu uzerinde kolayca dolasmak icin kullanilir. Asagida, bu dongunun kullanimi adim adim aciklanmistir:

#### 1. Dizi veya Iterable Koleksiyon Olusturun

Oncelikle, uzerinde dolasmak istediginiz bir dizi veya Iterable koleksiyon olusturun. Ornegin, bir dizi olusturalim:

```java
int[] sayilar = {1, 2, 3, 4, 5};
```

#### 2. For-each Dongusu Baslatin

Dizi veya Iterable koleksiyon uzerinde dolasmak icin "for-each" dongusunu baslatin. Ilk olarak, dongu baslangic ifadesini yazin:

```java
for (int sayi : sayilar) {
```

Bu ifade, her bir elemanin turunu (`int`), degisken adini (`sayi`), ve dizi adini (`sayilar`) icerir.

####  Ornek

Ilk iki adimi bir araya getirerek tam bir ornek olusturalim:

```java
public class ForEachExample {
    public static void main(String[] args) {
        // Dizi olustur
        int[] sayilar = {1, 2, 3, 4, 5};

        // For-each dongusu
        for (int sayi : sayilar) {
            // Her bir elemani ekrana yazdir
            System.out.println(sayi);
        }
    }
}
```

Bu ornek, "sayilar" adli bir dizideki her bir sayiyi ekrana yazdiracak basit bir "for-each" dongusu icermektedir. Bu temel kullanim, Java'da "for-each" dongusunun genel mantigini anlamaniza yardimci olacaktir.




```java
public class MatrixTraversalExample {
    public static void main(String[] args) {
        // 2 boyutlu matris olustur
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Normal for dongusu ile matris gezme:");

        // Normal for dongusu
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nFor-each dongusu ile matris gezme:");

        // For-each dongusu
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
```