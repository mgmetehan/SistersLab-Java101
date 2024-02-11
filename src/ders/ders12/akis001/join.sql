```sql
-- Siparisler tablosunu olusturalim
CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    order_date DATE,
    customer_id INT,
    total_amount NUMERIC
);

-- Musteriler tablosunu olusturalim
CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    customer_name VARCHAR(100),
    email VARCHAR(100)
);

-- Ornek veriler ekleyelim
INSERT INTO customers(customerName, email)
VALUES ('Ali', 'ali@gmail.com'),
       ('Ayse', 'ayse@gmail.com'),
       ('Fatma', 'fatma@gmail.com'),
       ('Mete', 'mete@gmail.com');

INSERT INTO orders(orderDate, customerId, totalAmount)
VALUES ('2024-02-05', 1, 200),
       ('2024-02-06', 2, 300),
       ('2024-02-07', 1, 400),
       ('2024-02-08', 3, 700),
       ('2024-02-09', 2, 1200),
       ('2024-02-10', 5, 2000);
```

Simdi farkli join turlerini kullanarak bu tablolari birlestirelim:

1. **INNER JOIN (Ic Join):** Iki tablonun kesisen kisimlarini getirir.

```sql
SELECT orders.order_id, orders.order_date, customers.customer_name
FROM orders
INNER JOIN customers ON orders.customer_id = customers.customer_id;
```

2. **LEFT JOIN (Sol Join):** Sol tablodaki her satir icin, sag tablodaki eslesen satirlari getirir. Eslesme yoksa NULL deger dondurur.

```sql
SELECT orders.order_id, orders.order_date, customers.customer_name
FROM orders
LEFT JOIN customers ON orders.customer_id = customers.customer_id;
```

3. **RIGHT JOIN (Sag Join):** Sag tablodaki her satir icin, sol tablodaki eslesen satirlari getirir. Eslesme yoksa NULL deger dondurur.

```sql
SELECT orders.order_id, orders.order_date, customers.customer_name
FROM orders
RIGHT JOIN customers ON orders.customer_id = customers.customer_id;
```

4. **FULL OUTER JOIN (Tam Dis Join):** Her iki tablodaki tum satirlari getirir ve eslesen satirlari birlestirir. Eslesme yoksa NULL deger dondurur.

```sql
SELECT orders.order_id, orders.order_date, customers.customer_name
FROM orders
FULL OUTER JOIN customers ON orders.customer_id = customers.customer_id;
```

