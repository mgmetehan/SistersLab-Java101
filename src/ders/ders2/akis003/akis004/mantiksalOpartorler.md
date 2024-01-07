Mantiksal operatorler

1. **Ve Operatoru (`&&`):**
    - Iki mantiksal ifadeyi birlestirir ve her ikisi de `true` oldugunda sonuc `true` olur.
   ```java
   boolean a = true;
   boolean b = false;
   boolean sonuc = (a && b); // false
   ```

2. **Veya Operatoru (`||`):**
    - Iki mantiksal ifadeyi birlestirir ve en az biri `true` oldugunda sonuc `true` olur.
   ```java
   boolean c = true;
   boolean d = false;
   boolean sonuc = (c || d); // true
   ```

3. **Degil Operatoru (`!`):**
    - Mantiksal ifadeyi tersine cevirir, `true` ise `false` yapar, `false` ise `true` yapar.
   ```java
   boolean e = true;
   boolean sonuc = !e; // false
   ```



| a | b | a && b | a \|\| b | !a | !b |
|---|---|--------|---------|----|----|
| 0 | 0 |   0    |    0    |  1 |  1 |
| 0 | 1 |   0    |    1    |  1 |  0 |
| 1 | 0 |   0    |    1    |  0 |  1 |
| 1 | 1 |   1    |    1    |  0 |  0 |



Diyelim ki:
- a, bir ogrencinin sinavda basarili olup olmadigini temsil ediyor (1 basarili, 0 basarisiz).
- b, ogrencinin odevlerini tamamlamis olup olmadigini temsil ediyor (1 tamamlamis, 0 tamamlamamis).

1. `a && b` (a ve b):
    - Bu ifade, ogrencinin sinavda basarili olup olmasi **ve** odevlerini tamamlamis olmasi durumunu temsil eder.
    - Ornek: a=1 (basarili), b=1 (tamamlamis) => Sonuc: 1 (Basarili ve tamamlamis).

2. `a || b` (a veya b):
    - Bu ifade, ogrencinin sinavda basarili olmasi **veya** odevlerini tamamlamis olmasi durumunu temsil eder.
    - Ornek: a=0 (basarisiz), b=1 (tamamlamis) => Sonuc: 1 (Basarisiz ancak tamamlamis).

3. `!a` (a'nin degili):
    - Bu ifade, ogrencinin sinavda basarisiz olmasi durumunu temsil eder.
    - Ornek: a=1 (basarili) => Sonuc: 0 (Basarisiz).

4. `!b` (b'nin degili):
    - Bu ifade, ogrencinin odevlerini tamamlamamis olmasi durumunu temsil eder.
    - Ornek: b=1 (tamamlamis) => Sonuc: 0 (Tamamlamamis).

